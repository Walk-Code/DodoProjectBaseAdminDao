package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemUserNotify;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;

import java.util.List;

/*
* @Description: 系统用户通知dao
* @Author: walk_code walk_code@163.com
* @Param:  
* @return:   
* @Date: 2019/1/17 11:03
*/ 
public interface SystemUserNotifyDaoService extends BaseDaoService<SystemUserNotify> {
	/*
	* @Description: 获取最后一条公告信息的
	* @Author: walk_code walk_code@163.com
	* @Param: [userId]
	* @return: com.dodo.project.base.admin.dao.system.model.SystemUserNotify
	* @Date: 2019/1/17 16:14
	*/
	SystemUserNotify getLast(int userId);
	
	/* 
	* @Description: 获取用户通知列表
	* @Author: walk_code walk_code@163.com
	* @Param: [userId] 
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemUserNotify>  
	* @Date: 2019/1/18 18:12
	*/ 
	List<SystemUserNotify> getList(int userId);
	
	/* 
	* @Description:  
	* @Author: walk_code walk_code@163.com
	* @Param: [userId, notifyId] 
	* @return: com.dodo.project.base.admin.dao.system.model.SystemUserNotify  
	* @Date: 2019/1/18 18:18
	*/ 
	SystemUserNotify findSystemUserNotify(int userId, int notifyId);
}
