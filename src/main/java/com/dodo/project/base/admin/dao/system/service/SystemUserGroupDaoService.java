package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemMenu;
import com.dodo.project.base.admin.dao.system.model.SystemUserGroup;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

/*
 * @Description: 用户组dao服务类
 * @Author: walk_code walk_code@163.com
 * @Param:
 * @return:
 * @Date: 2018/12/24 10:42
 */
public interface SystemUserGroupDaoService extends BaseDaoService<SystemUserGroup> {

	/*
	 * @Description: 获取用户组列表数据
	 * @Author: walk_code walk_code@163.com
	 * @Param: [page]
	 * @return: com.jfinal.plugin.activerecord.Page<com.dodo.project.base.admin.dao.system.model.SystemUserGroup>
	 * @Date: 2018/12/24 10:43
	 */
	Page<SystemUserGroup> getUserGroupList(int page);

	/*
	* @Description: 获取用户组
	* @Author: walk_code walk_code@163.com
	* @Param: []
	* @return: List<SystemUserGroup>
	* @Date: 2018/12/24 18:54
	*/
	List<SystemUserGroup> getUserGroupList();
	
	/* 
	* @Description: 获取当前用户菜单权限列表
	* @Author: walk_code walk_code@163.com
	* @Param: [systemUserId] 
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemMenu>  
	* @Date: 2018/12/26 19:05
	*/ 
	List<SystemMenu> getSystemMenu(int systemUserId);
	
	/* 
	* @Description: 获取用户组
	* @Author: walk_code walk_code@163.com
	* @Param: [] 
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemUserGroup>  
	* @Date: 2018/12/28 14:22
	*/ 
	List<SystemUserGroup> getSystemUserGroup(int systemUserId);
}
