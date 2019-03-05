package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.config.SystemDbConfiguration;
import com.dodo.project.base.admin.dao.system.model.SystemRoleMenuMapping;
import com.dodo.project.base.admin.dao.system.service.SystemRoleMenuMappingDaoService;
import com.jfinal.plugin.activerecord.Db;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <b>SystemRoleMenuMappingDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统角色与菜单关联dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/12/22 17:24
 * @Since JDK 1.8
 */
@Component
public class SystemRoleMenuMappingDaoServiceImpl implements SystemRoleMenuMappingDaoService {
	@Override
	public boolean del(int roleId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("DELETE FROM system_role_menu_mapping ");
		stringBuffer.append("WHERE role_id = '" + roleId + "' ");

		int row = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).delete(stringBuffer.toString());

		return row == 0 ? false : true;
	}

	@Override
	public boolean batchSave(List<SystemRoleMenuMapping> systemRoleMenuMappings) {
		int[] size = Db.use(SystemDbConfiguration.DB_CONFIG_NAME).batchSave(systemRoleMenuMappings, systemRoleMenuMappings.size());

		return size.length != systemRoleMenuMappings.size() ? false : true;
	}
}
