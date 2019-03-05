package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemSubscriptionConfig;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;

import java.util.List;

/*
 * <b>SystemSubscriptionConfigDaoService</b></br>
 *
 * <pre>
 * 系统用户订阅配置dao
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/1/17 18:23
 * @Since JDK 1.8
 */
public interface SystemSubscriptionConfigDaoService extends BaseDaoService<SystemSubscriptionConfig> {
	/*
	 * @Description: 获取用户配置信息
	 * @Author: walk_code walk_code@163.com
	 * @Param: [userId]
	 * @return: com.dodo.project.base.admin.dao.system.model.SystemSubscriptionConfig
	 * @Date: 2019/1/17 18:28
	 */
	List<SystemSubscriptionConfig> findSystemSubscriptionConfig(int userId);
}
