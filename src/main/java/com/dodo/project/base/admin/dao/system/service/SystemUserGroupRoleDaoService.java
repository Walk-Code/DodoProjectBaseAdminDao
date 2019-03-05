package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemRole;
import com.dodo.project.base.admin.dao.system.model.SystemUserGroupRole;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;

import java.util.List;

/*
 * @Description: 系统用户组与角色关系dao服务类
 * @Author: walk_code walk_code@163.com
 * @Param:
 * @return:
 * @Date: 2018/12/25 10:56
 */
public interface SystemUserGroupRoleDaoService extends BaseDaoService<SystemUserGroupRole> {

	/*
	 * @Description: 通过角色id获取相关用户组
	 * @Author: walk_code walk_code@163.com
	 * @Param: [roleId]
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemUserGroupRole>
	 * @Date: 2018/12/25 10:58
	 */
	List<SystemUserGroupRole> getSystemUserGroupRole(int roleId);

	/*
	 * @Description: 通过角色id删除角色与用户组关系
	 * @Author: walk_code walk_code@163.com
	 * @Param: [roleId]
	 * @return: boolean
	 * @Date: 2018/12/25 14:30
	 */
	boolean delSystemUserGroupRole(int roleId);

	/*
	 * @Description: 获取角色与用户组关系
	 * @Author: walk_code walk_code@163.com
	 * @Param: [roleId, groupId]
	 * @return: com.dodo.project.base.admin.dao.system.model.SystemUserGroupRole
	 * @Date: 2019/1/10 19:18
	 */
	SystemUserGroupRole findSystemUserGroupRole(int roleId, int groupId);


	/*
	 * @Description: 获取用户角色列表
	 * @Author: walk_code walk_code@163.com
	 * @Param: [groupId]
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemRole>
	 * @Date: 2019/1/11 18:50
	 */
	List<SystemRole> getSystemRoleList(int groupId);

}
