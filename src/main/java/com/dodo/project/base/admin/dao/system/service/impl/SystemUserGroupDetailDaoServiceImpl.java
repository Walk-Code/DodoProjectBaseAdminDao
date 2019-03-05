package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.config.SystemDbConfiguration;
import com.dodo.project.base.admin.dao.system.model.SystemUser;
import com.dodo.project.base.admin.dao.system.model.SystemUserGroupDetail;
import com.dodo.project.base.admin.dao.system.service.SystemUserGroupDetailDaoService;
import com.jfinal.plugin.activerecord.Db;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemUserGroupDetailDaoServiceImpl</b></br>
 *
 * <pre>
 * 用户组详dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/12/24 15:36
 * @Since JDK 1.8
 */
@Component
public class SystemUserGroupDetailDaoServiceImpl implements SystemUserGroupDetailDaoService {
	@Override
	public List<SystemUser> getSystemUser(int userGroupId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T2.* FROM system_user_group_detail T1 ");
		stringBuffer.append("LEFT JOIN system_user T2 ON T1.user_id = T2.id ");
		stringBuffer.append("WHERE T1.user_group_id = '" + userGroupId + "' ");

		return SystemUser.dao.find(stringBuffer.toString());
	}

	@Override
	public boolean del(int userGroupId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("DELETE FROM system_user_group_detail ");
		stringBuffer.append("WHERE user_group_id = '" + userGroupId + "' ");

		int row = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).delete(stringBuffer.toString());

		return row == 0 ? false : true;
	}

	@Override
	public boolean del(int userGroupId, int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("DELETE FROM system_user_group_detail ");
		stringBuffer.append("WHERE user_group_id = '" + userGroupId + "' ");
		stringBuffer.append("AND user_id = '"+userId+"' ");

		int row = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).delete(stringBuffer.toString());

		return row == 0 ? false : true;
	}

	@Override
	public SystemUserGroupDetail findSystemUserGroupDetail(int groupId, int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_group_detail ");
		stringBuffer.append("WHERE user_group_id = '" + groupId + "' ");
		stringBuffer.append("AND user_id = '"+userId+"' ");

		return SystemUserGroupDetail.dao.findFirst(stringBuffer.toString());
	}
}
