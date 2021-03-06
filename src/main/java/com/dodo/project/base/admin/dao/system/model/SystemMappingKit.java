package com.dodo.project.base.admin.dao.system.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     SystemMappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class SystemMappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("system_config", "id", SystemConfig.class);
		arp.addMapping("system_log", "id", SystemLog.class);
		arp.addMapping("system_menu", "id", SystemMenu.class);
		arp.addMapping("system_menu_node", "id", SystemMenuNode.class);
		arp.addMapping("system_notify", "id", SystemNotify.class);
		arp.addMapping("system_role", "id", SystemRole.class);
		arp.addMapping("system_role_menu_mapping", "id", SystemRoleMenuMapping.class);
		arp.addMapping("system_subscription", "id", SystemSubscription.class);
		arp.addMapping("system_subscription_config", "id", SystemSubscriptionConfig.class);
		arp.addMapping("system_user", "id", SystemUser.class);
		arp.addMapping("system_user_group", "id", SystemUserGroup.class);
		arp.addMapping("system_user_group_detail", "id", SystemUserGroupDetail.class);
		arp.addMapping("system_user_group_role", "id", SystemUserGroupRole.class);
		arp.addMapping("system_user_notify", "id", SystemUserNotify.class);
	}
}

