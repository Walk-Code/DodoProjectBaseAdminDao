package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemUser;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

/**
 * <b>SystemUserDaoService</b></br>
 *
 * <pre>
 * 系统用户dao服务类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/5 10:21
 * @Since JDK 1.8
 */
public interface SystemUserDaoService extends BaseDaoService<SystemUser> {

	/*
	 * @Description: 用户登录校验
	 * @Author: walk_code walk_code@163.com
	 * @Param: [username, password]
	 * @return: boolean
	 * @Date: 2018/11/5 10:34
	 */
	SystemUser findSystemUserByUserName(String username);

	/*
	 * @Description: 获取所有用户
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemUser>
	 * @Date: 2018/12/24 14:47
	 */
	List<SystemUser> getSystemUser();

	/*
	 * @Description: 获取列表数据
	 * @Author: walk_code walk_code@163.com
	 * @Param: [page]
	 * @return: com.jfinal.plugin.activerecord.Page<com.dodo.project.base.admin.dao.system.model.SystemUser>
	 * @Date: 2018/12/27 16:06
	 */
	Page<SystemUser> getList(int page);

	/*
	 * @Description:  修改用户状态
	 * @Author: walk_code walk_code@163.com
	 * @Param: [id, status]
	 * @return: boolean
	 * @Date: 2018/12/27 16:09
	 */
	boolean changeSystemUserStatus(int id, int status);
	
	/* 
	* @Description: 校验用户名唯一性
	* @Author: walk_code walk_code@163.com
	* @Param: [id, username] 
	* @return: com.dodo.project.base.admin.dao.system.model.SystemUser  
	* @Date: 2018/12/28 10:49
	*/ 
	SystemUser checkSystemUser(Integer id, String username);
}
