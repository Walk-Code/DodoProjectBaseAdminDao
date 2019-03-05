package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemUser;
import com.dodo.project.base.admin.dao.system.model.SystemUserGroupDetail;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.jfinal.plugin.activerecord.Model;

import java.util.List;

/*
 * @Description: 用户组详dao服务类
 * @Author: walk_code walk_code@163.com
 * @Param:
 * @return:
 * @Date: 2018/12/24 15:34
 */
public interface SystemUserGroupDetailDaoService extends BaseDaoService<SystemUserGroupDetail> {

	/*
	 * @Description: 获取用户组中用户列表
	 * @Author: walk_code walk_code@163.com
	 * @Param: [userGroupId]
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemUser>
	 * @Date: 2018/12/24 15:36
	 */
	List<SystemUser> getSystemUser(int userGroupId);
	
	/* 
	* @Description: 删除用户组明细 
	* @Author: walk_code walk_code@163.com
	* @Param: [userGroupId] 
	* @return: boolean  
	* @Date: 2018/12/24 15:58
	*/ 
	boolean del(int userGroupId);
	
	/* 
	* @Description: 删除用户组与用户关系
	* @Author: walk_code walk_code@163.com
	* @Param: [userGroupId, userId] 
	* @return: boolean  
	* @Date: 2018/12/24 16:34
	*/ 
	boolean del(int userGroupId, int userId);
	
	/* 
	* @Description: 获取用户组与用户关系 
	* @Author: walk_code walk_code@163.com
	* @Param: [groupId, userId] 
	* @return: com.dodo.project.base.admin.dao.system.model.SystemUserGroupDetail  
	* @Date: 2018/12/24 17:07
	*/ 
	SystemUserGroupDetail findSystemUserGroupDetail(int groupId, int userId);
}
