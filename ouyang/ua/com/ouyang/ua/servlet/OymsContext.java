package com.ouyang.ua.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ouyang.ua.exception.OymsException;
import com.ouyang.ua.servlet.initserver.IOymsInitServer;

public class OymsContext extends HttpServlet{
	private ApplicationContext appctx = null;
	private final static Logger log = Logger.getLogger(OymsContext.class);
	public void destroy() {
		appctx = null;
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		log.info("初始化服务启动开始。。。");
		appctx=WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
		String serversInit=config.getInitParameter("serversInit");
		if(null != serversInit && !"".equals(serversInit.trim())){
			String[] serversInits=serversInit.split("\\,");
			int length=serversInits.length;
			for(int i=0;i<length;i++){
				String serverx=serversInits[i].trim();
				log.info("执行初始化服务【" + serverx + "】开始。。。");
				boolean retEx = true;
				try {
					retEx=((IOymsInitServer)Class.forName(serverx).newInstance()).execute(appctx);
				} catch (Exception e) {
					log.error("服务【" + serverx + "】执行异常，请查找原因并处理后重新启动！", e);
					retEx = false;
				}
				if(true == retEx)
					log.info("执行初始化服务【" + serverx + "】结束，初始化结果【成功】。");
				else
					log.info("执行初始化服务【" + serverx + "】结束，初始化结果【失败】。");
			}
		}
		log.info("初始化服务启动结束。");
	}

}
