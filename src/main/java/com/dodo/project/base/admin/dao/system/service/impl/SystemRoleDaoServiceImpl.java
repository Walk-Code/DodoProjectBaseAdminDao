package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.config.SystemDbConfiguration;
import com.dodo.project.base.admin.dao.system.model.SystemRole;
import com.dodo.project.base.admin.dao.system.service.SystemRoleDaoService;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemRoleDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统角色dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/5 14:12
 * @Since JDK 1.8
 */
@Component
public class SystemRoleDaoServiceImpl implements SystemRoleDaoService {

	@Override
	public Page<SystemRole> getSystemRoleList(int page) {
		int currentPage     = page == 0 ? 1 : page;
		int currentPageSize = 10;

		StringBuffer select = new StringBuffer();
		select.append("SELECT T1.* ");
		StringBuffer from = new StringBuffer();
		from.append("FROM system_role T1 ");
		from.append("GROUP BY T1.id");

		return SystemRole.dao.paginate(currentPage, currentPageSize, select.toString(), from.toString());
	}

	@Override
	public SystemRole findSystemRole(int roleId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_role ");
		stringBuffer.append("WHERE id = '" + roleId + "' ");

		return SystemRole.dao.findFirst(stringBuffer.toString());
	}

	@Override
	public boolean changeRoleStatus(int roleId, int status) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("UPDATE system_role ");
		stringBuffer.append("SET status = " + status + " ");
		stringBuffer.append("WHERE id = '" + roleId + "' ");
		if (status == 1) {
			stringBuffer.append("AND status = 2 ");
		} else if (status == 2) {
			stringBuffer.append("AND status = 1 ");
		}


		int row = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).update(stringBuffer.toString());

		return row == 0 ? false : true;
	}

	@Override
	public List<SystemRole> getSystemRoleList() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_role");

		return SystemRole.dao.find(stringBuffer.toString());
	}
}
