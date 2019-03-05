package com.dodo.project.base.admin.dao.config;

import com.dodo.project.base.admin.dao.system.model.SystemMappingKit;
import com.dodo.project.base.dao.jfinal.base.AbstractBaseJfinalDbConfiguration;
import com.dodo.project.base.dao.jfinal.config.DbConfigurationInfoBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
 * <b>SystemDbConfiguration</b></br>
 *
 * <pre>
 * 系统数据库配置
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/11/2 17:24
 * @Since JDK 1.8
 */
/*@Configuration*/
public class SystemDbConfiguration extends AbstractBaseJfinalDbConfiguration {
	public static final String DB_CONFIG_NAME = "system";

	@Value("${datasource.systemdb.url}")
	private String url;

	@Value("${datasource.systemdb.username}")
	private String username;

	@Value("${datasource.systemdb.password}")
	private String password;

	@Override
	protected DbConfigurationInfoBean configDbConfigurationInfoBean() {
		DbConfigurationInfoBean dbconfig = new DbConfigurationInfoBean();
		dbconfig.setUserName(username);
		dbconfig.setConfigName(DB_CONFIG_NAME);
		dbconfig.setUrl(url);
		dbconfig.setPassword(password);

		return dbconfig;
	}

	/*
	 * @Description: db配置初始化前配置db插件
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: void
	 * @Date: 2018/11/2 17:33
	 */
	@PostConstruct
	public void configAndStartDbPlugin() {
		this.configAndStartDbPlugin(SystemMappingKit.class);
	}

	/*
	 * @Description: 注销db配置前停用db插件
	 * @Author: walk_code walk_code@163.com
	 * @Param: []
	 * @return: void
	 * @Date: 2018/11/2 17:34
	 */
	@PreDestroy
	public void destory() {
		this.stopDbPlugin();
	}
}
