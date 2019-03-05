package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.system.model.SystemSubscriptionConfig;
import com.dodo.project.base.admin.dao.system.service.SystemSubscriptionConfigDaoService;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemSubscriptionConfigDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统用户订阅配置dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/1/17 18:24
 * @Since JDK 1.8
 */
@Component
public class SystemSubscriptionConfigDaoServiceImpl implements SystemSubscriptionConfigDaoService {

	@Override
	public List<SystemSubscriptionConfig> findSystemSubscriptionConfig(int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_subscription_config ");
		stringBuffer.append("WHERE user_id = '"+userId+"' ");

		return SystemSubscriptionConfig.dao.find(stringBuffer.toString());
	}
}
