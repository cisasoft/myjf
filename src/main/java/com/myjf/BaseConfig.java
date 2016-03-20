package com.myjf;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.myjf.controller.BlogController;
import com.myjf.controller.IndexController;
import com.myjf.interceptor.BlogInterceptor;
import com.myjf.model._MappingKit;

/**
 * API引导式配置
 */
public class BaseConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// 获取数据库连接配置信息
		PropKit.use("config.properties");
		me.setDevMode(PropKit.getBoolean("devMode", false));
		me.setViewType(ViewType.FREE_MARKER);
	}

	@Override
	public void configRoute(Routes me) {
		// 路由配置信息，请求交于哪个controller处理
		me.add("/", IndexController.class, "/index");
		me.add("/blog", BlogController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
		C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
		me.add(c3p0Plugin);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		me.add(arp);
		_MappingKit.mapping(arp);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		me.add(new BlogInterceptor());
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}
	
}
