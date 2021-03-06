package com.dodo.project.base.admin.dao.system.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSystemSubscription<M extends BaseSystemSubscription<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setTarget(java.lang.Integer target) {
		set("target", target);
	}
	
	public java.lang.Integer getTarget() {
		return getInt("target");
	}

	public void setTargetType(java.lang.String targetType) {
		set("target_type", targetType);
	}
	
	public java.lang.String getTargetType() {
		return getStr("target_type");
	}

	public void setAction(java.lang.String action) {
		set("action", action);
	}
	
	public java.lang.String getAction() {
		return getStr("action");
	}

	public void setSystemUserId(java.lang.Integer systemUserId) {
		set("system_user_id", systemUserId);
	}
	
	public java.lang.Integer getSystemUserId() {
		return getInt("system_user_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
