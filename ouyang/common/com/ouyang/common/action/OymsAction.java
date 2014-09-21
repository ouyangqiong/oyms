package com.ouyang.common.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author 欧阳琼 2013-5-30
 */

public class OymsAction extends ActionSupport implements ServletContextAware,
		ServletRequestAware, ServletResponseAware, SessionAware {

	private static final long serialVersionUID = -6583117394544275523L;

	// application server context
	protected ServletContext servletContext;
	protected HttpSession httpSession;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map session;

	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		this.httpSession=request.getSession();
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
	}

	public void setSession(Map session) {
		this.session=session;
	}

}
