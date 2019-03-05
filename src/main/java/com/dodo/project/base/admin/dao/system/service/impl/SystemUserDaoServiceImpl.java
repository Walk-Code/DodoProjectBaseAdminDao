package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.config.SystemDbConfiguration;
import com.dodo.project.base.admin.dao.system.model.SystemUser;
import com.dodo.project.base.admin.dao.system.service.SystemUserDaoService;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemUserDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统用户dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/5 10:27
 * @Since JDK 1.8
 */
@Component
public class SystemUserDaoServiceImpl implements SystemUserDaoService {
	@Override
	public SystemUser findSystemUserByUserName(String username) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user ");
		stringBuffer.append("WHERE username = ? ");
		stringBuffer.append("AND status = 2 ");

		return SystemUser.dao.findFirst(stringBuffer.toString(), username);
	}

	@Override
	public List<SystemUser> getSystemUser() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user ");

		return SystemUser.dao.find(stringBuffer.toString());
	}

	@Override
	public Page<SystemUser> getList(int page) {
		int currentPage     = page == 0 ? 1 : page;
		int currentPageSize = 10;

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT id, username, qq, email, phone, remark, status, login_num, update_time ");
		StringBuffer stringBuffer1 = new StringBuffer();
		stringBuffer1.append("FROM system_user ");

		return SystemUser.dao.paginate(currentPage, currentPageSize, stringBuffer.toString(), stringBuffer1.toString());
	}

	@Override
	public boolean changeSystemUserStatus(int id, int status) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("UPDATE system_user ");
		stringBuffer.append("SET status = " + status + " ");
		stringBuffer.append("WHERE id = '" + id + "' ");

		int row = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).update(stringBuffer.toString());

		return row == 0 ? false : true;
	}

	@Override
	public SystemUser checkSystemUser(Integer id, String username) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user ");
		stringBuffer.append("WHERE id > 0 ");
		stringBuffer.append("AND username = '" + username + "' ");
		if (null != id) {
			stringBuffer.append("AND id != '" + id + "' ");
		}

		return SystemUser.dao.findFirst(stringBuffer.toString());
	}
}
