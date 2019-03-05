package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.config.SystemDbConfiguration;
import com.dodo.project.base.admin.dao.system.model.SystemRole;
import com.dodo.project.base.admin.dao.system.model.SystemUserGroupRole;
import com.dodo.project.base.admin.dao.system.service.SystemUserGroupRoleDaoService;
import com.jfinal.plugin.activerecord.Db;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemUserGroupRoleDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统用户组与角色关系dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/12/25 10:58
 * @Since JDK 1.8
 */
@Component
public class SystemUserGroupRoleDaoServiceImpl implements SystemUserGroupRoleDaoService {
	@Override
	public List<SystemUserGroupRole> getSystemUserGroupRole(int roleId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_group_role ");
		stringBuffer.append("WHERE role_id = '" + roleId + "' ");

		return SystemUserGroupRole.dao.find(stringBuffer.toString());
	}

	@Override
	public boolean delSystemUserGroupRole(int roleId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("DELETE FROM system_user_group_role ");
		stringBuffer.append("WHERE role_id = '" + roleId + "' ");

		int row = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).delete(stringBuffer.toString());

		return row == 0 ? false : true;
	}

	@Override
	public SystemUserGroupRole findSystemUserGroupRole(int roleId, int groupId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_group_role ");
		stringBuffer.append("WHERE role_id = '" + roleId + "' ");
		stringBuffer.append("AND user_group_id = '" + groupId + "' ");

		return SystemUserGroupRole.dao.findFirst(stringBuffer.toString());
	}

	@Override
	public List<SystemRole> getSystemRoleList(int groupId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T2.* FROM system_user_group_role T1 ");
		stringBuffer.append("LEFT JOIN system_role T2 ON T1.role_id = T2.id ");
		stringBuffer.append("WHERE T1.user_group_id = '" + groupId + "' ");
		stringBuffer.append("GROUP BY T1.id ");

		return SystemRole.dao.find(stringBuffer.toString());
	}
}
