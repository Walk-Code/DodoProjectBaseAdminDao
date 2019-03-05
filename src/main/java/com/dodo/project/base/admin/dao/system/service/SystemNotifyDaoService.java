package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemNotify;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;

import java.util.Date;
import java.util.List;

/*
 * @Description: 系统通知dao
 * @Author: walk_code walk_code@163.com
 * @Param:
 * @return:
 * @Date: 2019/1/17 11:03
 */
public interface SystemNotifyDaoService extends BaseDaoService<SystemNotify> {
	/*
	* @Description: 根据创建时间获取未发送的系统公告记录
	* @Author: walk_code walk_code@163.com
	* @Param: [createTime]
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemNotify>
	* @Date: 2019/1/17 16:30
	*/
	List<SystemNotify> getSystemAnnounceNotify(String createTime);
	
	/* 
	* @Description: 获取所有系統公告记录
	* @Author: walk_code walk_code@163.com
	* @Param: [] 
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemNotify>  
	* @Date: 2019/1/17 16:38
	*/ 
	List<SystemNotify> getSystemAnnounceNotify();

	/*
	* @Description: 获取系统提醒记录
	* @Author: walk_code walk_code@163.com
	* @Param: [userId]
	* @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemNotify>
	* @Date: 2019/1/17 18:00
	*/
	List<SystemNotify> getRemindNotify(int userId);
}
