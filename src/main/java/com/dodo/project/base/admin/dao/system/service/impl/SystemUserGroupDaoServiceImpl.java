package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.system.model.SystemMenu;
import com.dodo.project.base.admin.dao.system.model.SystemUserGroup;
import com.dodo.project.base.admin.dao.system.service.SystemUserGroupDaoService;
import com.jfinal.plugin.activerecord.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemUserGroupDaoServiceImpl</b></br>
 *
 * <pre>
 * 用户组dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/12/24 10:43
 * @Since JDK 1.8
 */
@Component
public class SystemUserGroupDaoServiceImpl implements SystemUserGroupDaoService {
	@Override
	public Page<SystemUserGroup> getUserGroupList(int page) {
		int currentPage     = page == 0 ? 1 : page;
		int currentPageSize = 10;

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * ");

		StringBuffer stringBuffer1 = new StringBuffer();
		stringBuffer1.append("FROM system_user_group ");

		return SystemUserGroup.dao.paginate(currentPage, currentPageSize, stringBuffer.toString(), stringBuffer1.toString());
	}

	@Override
	public List<SystemUserGroup> getUserGroupList() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_group ");

		return SystemUserGroup.dao.find(stringBuffer.toString());
	}

	@Override
	public List<SystemMenu> getSystemMenu(int systemUserId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T5.* FROM system_user_group T1 ");
		stringBuffer.append("LEFT JOIN system_user_group_detail T2 ON T1.id = T2.user_group_id ");
		stringBuffer.append("LEFT JOIN system_user_group_role T3 ON T1.id = T3.user_group_id ");
		stringBuffer.append("LEFT JOIN system_role_menu_mapping T4 ON T4.role_id = T3.id ");
		stringBuffer.append("LEFT JOIN system_menu T5 ON T5.id = T4.menu_id ");
		stringBuffer.append("LEFT JOIN system_menu_node T6 ON T6.menu_id = T5.id ");
		stringBuffer.append("WHERE T2.user_id = '" + systemUserId + "' ");
		stringBuffer.append("AND T5.status = 1 ");

		return SystemMenu.dao.find(stringBuffer.toString());
	}

	@Override
	public List<SystemUserGroup> getSystemUserGroup(int systemUserId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T1.* FROM system_user_group T1 ");
		stringBuffer.append("LEFT JOIN system_user_group_detail T2 ON T1.id = T2.user_group_id ");

		if (systemUserId != 0) {
			stringBuffer.append("WHERE T2.user_id = '"+systemUserId+"' ");
		}

		return SystemUserGroup.dao.find(stringBuffer.toString());
	}
}
