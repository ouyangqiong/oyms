package com.ouyang.common.filter;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @ClassName I18nFilter
 * @Description TODO(国际化过滤器)
 * @author 欧阳琼
 * @date 2014-1-7 上午11:26:18
 */
public class I18nFilter implements Filter{
	private FilterConfig config = null;
	public FilterConfig getConfig() {
		return config;
	}
	public void setConfig(FilterConfig config) {
		this.config = config;
	}
	//初始化
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config=filterConfig;
	}
	public void destroy() {
	}
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain filterChain) throws IOException, ServletException {
			Locale locale;
			String request_locale = req.getParameter("locale");
			HttpServletRequest r = (HttpServletRequest) req;
			if(request_locale!=null){
				if(request_locale.equals("en_US")){		
					locale=new Locale("en", "US"); 	
					r.getSession().setAttribute("WW_TRANS_I18N_LOCALE", locale);
				}else if(request_locale.equals("zh_CN")){		
					locale=new Locale("zh", "CN");
					r.getSession().setAttribute("WW_TRANS_I18N_LOCALE", locale);
				}
			}
			  
			
			OymsRequestWrapper request = new OymsRequestWrapper(r);  
			filterChain.doFilter(request, resp);  

	}
}
