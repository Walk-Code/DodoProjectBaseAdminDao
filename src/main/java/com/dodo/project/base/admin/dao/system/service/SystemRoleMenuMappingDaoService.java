package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemRoleMenuMapping;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;

import java.util.List;

/**
 * <b>SystemRoleMenuMappingDaoService</b></br>
 *
 * <pre>
 * 系统角色与菜单关联dao服务类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/12/22 17:22
 * @Since JDK 1.8
 */
public interface SystemRoleMenuMappingDaoService extends BaseDaoService<SystemRoleMenuMapping> {
	/* 
	* @Description: 删除角色对应的所有菜单
	* @Author: walk_code walk_code@163.com
	* @Param: [roleId] 
	* @return: boolean  
	* @Date: 2018/12/22 17:24
	*/ 
	boolean del(int roleId);
	
	/* 
	* @Description: 批量保存角色与菜单关系 
	* @Author: walk_code walk_code@163.com
	* @Param: [systemRoleMenuMappings] 
	* @return: boolean  
	* @Date: 2018/12/22 17:27
	*/ 
	boolean batchSave(List<SystemRoleMenuMapping> systemRoleMenuMappings);
}
