package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.system.model.SystemUserNotify;
import com.dodo.project.base.admin.dao.system.service.SystemUserNotifyDaoService;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * <b>SystemUserNotifyDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统用户通知dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/1/17 14:42
 * @Since JDK 1.8
 */
@Component
public class SystemUserNotifyDaoServiceImpl implements SystemUserNotifyDaoService {
	@Override
	public SystemUserNotify getLast(int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_notify ");
		stringBuffer.append("WHERE system_user_id = '" + userId + "' ");
		stringBuffer.append("ORDER BY create_time DESC ");

		return SystemUserNotify.dao.findFirst(stringBuffer.toString());
	}

	@Override
	public List<SystemUserNotify> getList(int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_notify ");
		stringBuffer.append("WHERE system_user_id = '" + userId + "' ");

		return SystemUserNotify.dao.find(stringBuffer.toString());
	}

	@Override
	public SystemUserNotify findSystemUserNotify(int userId, int notifyId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_user_notify ");
		stringBuffer.append("WHERE system_user_id = '" + userId + "' ");
		stringBuffer.append("AND notify_id = '" + notifyId + "' ");

		return SystemUserNotify.dao.findFirst(stringBuffer.toString());
	}
}
