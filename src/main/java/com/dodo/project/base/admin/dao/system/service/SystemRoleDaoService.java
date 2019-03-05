package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemRole;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

/*
 * <b>SystemRoleDaoService</b></br>
 *
 * <pre>
 * 系统角色表
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/5 11:54
 * @Since JDK 1.8
 */
public interface SystemRoleDaoService extends BaseDaoService<SystemRole> {
	/* 
	* @Description: 获取用户所有角色
	* @Author: walk_code walk_code@163.com
	* @Param: [] 
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemAuth>  
	* @Date: 2018/11/5 14:27
	*/ 
	Page<SystemRole> getSystemRoleList(int page);
	
	/* 
	* @Description: 根据id获取角色
	* @Author: walk_code walk_code@163.com
	* @Param: [roleId] 
	* @return: com.dodo.project.base.admin.dao.system.model.SystemRole  
	* @Date: 2018/12/25 10:46
	*/ 
	SystemRole findSystemRole(int roleId);
	
	/* 
	* @Description: 修改角色
	* @Author: walk_code walk_code@163.com
	* @Param: [roleId] 
	* @return: boolean  
	* @Date: 2018/12/25 18:46
	*/ 
	boolean changeRoleStatus(int roleId, int status);
	
	/* 
	* @Description: 获取角色列表
	* @Author: walk_code walk_code@163.com
	* @Param: [] 
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemRole>  
	* @Date: 2019/1/10 19:14
	*/ 
	List<SystemRole> getSystemRoleList();
	
}
