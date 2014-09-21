/**
 * 
 */
package com.ouyang.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description TODO(编码过滤器)
 * @author 欧阳琼
 * 2013-9-14
 */
public class OymsEncodingFilter implements Filter{
	private FilterConfig config=null;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException{ 
		String encoding=config.getInitParameter("encoding");
		response.setCharacterEncoding(encoding);
		request.setCharacterEncoding(encoding);
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config=config;
	}

}
