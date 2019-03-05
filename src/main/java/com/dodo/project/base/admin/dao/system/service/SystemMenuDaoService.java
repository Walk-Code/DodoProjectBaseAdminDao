package com.dodo.project.base.admin.dao.system.service;

import com.dodo.project.base.admin.dao.system.model.SystemMenu;
import com.dodo.project.base.dao.jfinal.service.BaseDaoService;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;

/*
 * <b>SystemMenuDaoService</b></br>
 *
 * <pre>
 * 系统菜单dao服务类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/5 11:26
 * @Since JDK 1.8
 */
public interface SystemMenuDaoService extends BaseDaoService<SystemMenu> {

	/*
	 * @Description: 获取启用的系统菜单
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemMenu>
	 * @Date: 2018/11/5 11:27
	 */
	List<SystemMenu> getEnableSystemMenu();

	/*
	 * @Description: 获取启用的系统菜单（只获菜单的节点）
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemMenu>
	 * @Date: 2019/1/8 16:52
	 */
	List<SystemMenu> getEnableSystemMenuNoNode(int userId);

	/*
	 * @Description: 获取系统所有节点
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemMenu>
	 * @Date: 2018/12/19 16:21
	 */
	List<Record> getEnableSystemNode();

	/*
	 * @Description: 通过id获取菜单信息
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: com.jfinal.plugin.activerecord.Record
	 * @Date: 2018/12/27 15:22
	 */
	Record findSystemMenu(int id);

	/*
	 * @Description: 获取用户权限
	 * @Author: walk_code walk_code@163.com
	 * @Param: [systemUserId]
	 * @return: java.util.List<com.dodo.project.base.admin.dao.system.model.SystemMenu>
	 * @Date: 2019/1/10 10:43
	 */
	List<SystemMenu> getPermission(int systemUserId);
}
