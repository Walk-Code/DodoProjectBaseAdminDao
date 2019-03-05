package com.dodo.project.base.admin.dao.system.service.impl;

import com.dodo.project.base.admin.dao.system.model.SystemNotify;
import com.dodo.project.base.admin.dao.system.service.SystemNotifyDaoService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/*
 * <b>SystemNotifyDaoServiceImpl</b></br>
 *
 * <pre>
 * 系统通知dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/1/17 11:04
 * @Since JDK 1.8
 */
@Component
public class SystemNotifyDaoServiceImpl implements SystemNotifyDaoService {
	@Override
	public List<SystemNotify> getSystemAnnounceNotify(String createTime) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_notify ");
		stringBuffer.append("WHERE type = '1' ");
		stringBuffer.append("AND create_tiem >= '" + createTime + "' ");

		return SystemNotify.dao.find(stringBuffer.toString());
	}

	@Override
	public List<SystemNotify> getSystemAnnounceNotify() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT * FROM system_notify ");
		stringBuffer.append("WHERE type = '1' ");

		return SystemNotify.dao.find(stringBuffer.toString());
	}

	@Override
	public List<SystemNotify> getRemindNotify(int userId) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("SELECT T1.* FROM system_notify T1 ");
		stringBuffer.append("LEFT JOIN system_subscription T2 ON T1.target = t2.target AND T1.target_type = T2.target_type AND T1.action = T2.action ");
		stringBuffer.append("WHERE type = '2' ");
		stringBuffer.append("AND T2.system_user_id = '" + userId + "' ");
		stringBuffer.append("AND T1.create_time > T2.cteate_time ");

		return SystemNotify.dao.find(stringBuffer.toString());
	}
}
