package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.config.SystemDbConfiguration;
import com.dodo.project.base.admin.dao.system.model.SystemMenu;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import org.springframework.stereotype.Component;
import com.dodo.project.base.admin.dao.system.service.SystemMenuDaoService;

import java.util.List;

/*
 * <b>SystemMenuDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统菜单dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/5 11:27
 * @Since JDK 1.8
 */
@Component
public class SystemMenuDaoServiceImpl implements SystemMenuDaoService {

	@Override
	public List<SystemMenu> getEnableSystemMenu() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T1.* FROM system_menu T1 ");
		stringBuffer.append("LEFT JOIN system_menu_node T2 ON T1.id = T2.menu_id ");
		stringBuffer.append("WHERE status = 1 ");
		// stringBuffer.append("AND T2.is_menu = 1 ");

		return SystemMenu.dao.find(stringBuffer.toString());
	}

	@Override
	public List<SystemMenu> getEnableSystemMenuNoNode(int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T5.* FROM system_user_group_detail T1 ");
		stringBuffer.append("LEFT JOIN system_user_group_role T2 ON T1.user_group_id = T2.user_group_id ");
		stringBuffer.append("LEFT JOIN system_role T3 ON T2.role_id = T3.id ");
		stringBuffer.append("LEFT JOIN system_role_menu_mapping T4 ON T3.id = T4.role_id ");
		stringBuffer.append("LEFT JOIN system_menu T5 ON T4.menu_id = T5.id ");
		stringBuffer.append("LEFT JOIN system_menu_node T6 ON T5.id = T6.menu_id ");
		stringBuffer.append("WHERE T5.status = 1 ");
		if (userId > 0) {
			stringBuffer.append("AND T1.user_id = '" + userId + "' ");
		}
		stringBuffer.append("AND T6.is_menu = 1 ");
		stringBuffer.append("GROUP BY T5.id ");

		return SystemMenu.dao.find(stringBuffer.toString());
	}

	@Override
	public List<Record> getEnableSystemNode() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T1.*, T2.is_menu, T2.is_auth FROM system_menu T1 ");
		stringBuffer.append("LEFT JOIN system_menu_node T2 ON T1.id = T2.menu_id ");
		stringBuffer.append("WHERE status = 1 ");

		return Db.use(SystemDbConfiguration.DB_CONFIG_NAME).find(stringBuffer.toString());
	}

	@Override
	public Record findSystemMenu(int id) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T1.*, T2.is_menu, T2.is_auth FROM system_menu T1 ");
		stringBuffer.append("LEFT JOIN system_menu_node T2 ON T1.id = T2.menu_id ");
		stringBuffer.append("WHERE T1.id = '" + id + "' ");

		return Db.use(SystemDbConfiguration.DB_CONFIG_NAME).findFirst(stringBuffer.toString());
	}

	@Override
	public List<SystemMenu> getPermission(int systemUserId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T5.* FROM system_user T1 ");
		stringBuffer.append("LEFT JOIN system_user_group_detail T2 ON T2.user_id = T1.id ");
		stringBuffer.append("LEFT JOIN system_user_group_role T3 ON T3.user_group_id = T2.user_group_id ");
		stringBuffer.append("LEFT JOIN system_role_menu_mapping T4 ON T4.role_id = T3.role_id ");
		stringBuffer.append("LEFT JOIN system_menu T5 ON T4.menu_id = T5.id ");
		stringBuffer.append("LEFT JOIN system_menu_node T6 ON T5.id = T6.menu_id ");
		stringBuffer.append("WHERE T5.status = 1 ");
		stringBuffer.append("AND T1.id = '" + systemUserId + "' ");

		return SystemMenu.dao.find(stringBuffer.toString());
	}
}
