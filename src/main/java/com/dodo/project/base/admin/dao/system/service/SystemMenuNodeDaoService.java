package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemMenu;
import com.dodo.project.base.admin.dao.system.model.SystemMenuNode;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;

import java.util.List;

/*
* @Description: 系统菜单拓展dao
* @Author: walk_code walk_code@163.com
* @Param:  
* @return:   
* @Date: 2018/12/19 15:30
*/ 
public interface SystemMenuNodeDaoService extends BaseDaoService<SystemMenuNode> {
	/*
	 * @Description: 获取角色对应菜单权限（支持多个角色）
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemMenu>
	 * @Date: 2018/12/22 14:53
	 */
	List<SystemMenu> getRoleEnableSystemMenuNode(String roleIds);
}
