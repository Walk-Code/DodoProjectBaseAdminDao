package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.system.model.SystemMenu;
import com.dodo.project.base.admin.dao.system.service.SystemMenuNodeDaoService;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemMenuNodeDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统菜单拓展dao实现
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/12/19 15:31
 * @Since JDK 1.8
 */
@Component
public class SystemMenuNodeDaoServiceImpl implements SystemMenuNodeDaoService {
	@Override
	public List<SystemMenu> getRoleEnableSystemMenuNode(String roleIds) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T2.* FROM system_menu_node T1 ");
		stringBuffer.append("INNER JOIN system_menu T2 ON T1.menu_id = T2.id ");
		stringBuffer.append("INNER JOIN system_role_menu_mapping T3 ON T2.id = T3.menu_id ");
		stringBuffer.append("WHERE T1.is_auth = 1 ");
		stringBuffer.append("AND T3.role_id IN (" + roleIds + ") ");


		return SystemMenu.dao.find(stringBuffer.toString());
	}
}
