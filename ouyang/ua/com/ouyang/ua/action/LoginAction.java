package com.ouyang.ua.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ouyang.common.action.OymsAction;
import com.ouyang.ua.domain.User;
import com.ouyang.ua.service.ILoginService;

/**
 * 
 * @author 欧阳琼 2013-5-30
 */
public class LoginAction extends OymsAction {
	private static final long serialVersionUID = 3506553838531093596L;
	private static final Logger log = Logger.getLogger(LoginAction.class);
	private User user;
	private ILoginService loginService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ILoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	/*
	 * to login page
	 */
	public String loginPage() {
		return LOGIN;
	}

	/**
	 * 登录
	 * @return
	 */
	public String login() {
		log.debug("user login");
		// 1.验证用户是否存在
		User sessionUser = (User) httpSession.getAttribute("user");
		if (sessionUser != null) {
			return "uaMain";
		}
		if (user == null) {
			return LOGIN;
		}
		User dbUser = loginService.isUserExist(user.getLoginName());
		if (dbUser != null) {
			// 2.判断用户名密码是否正确
			if (dbUser.getPassword().equals(user.getPassword())) {
				this.httpSession.setAttribute("user", dbUser);
				log.debug("登陆成功！");
				return "uaMain";
			} else {
				request.setAttribute("loginError", this
						.getText("ua.login.user_or_password_incorrect"));
			}
		} else {
			request.setAttribute("loginError", this
					.getText("ua.login.user_not_exist"));
		}
		return LOGIN;
	}

	/**
	 * 注册
	 * @return
	 */
	public String registerUser() {
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			boolean flag = loginService.isUserRegister(user.getLoginName());
			if (!flag) {
				pw.write("[{\"regInfo\":\""
						+ this.getText("ua.register.login_name_exist")
						+ "\",\"flag\":\"failure\"}]");
			} else {
				if (loginService.registerUser(user)) {
					pw.write("[{\"regInfo\":\""
							+ this.getText("ua.register.success")
							+ "\",\"flag\":\"success\"}]");
				} else {
					pw.write("[{\"regInfo\":\""
							+ this.getText("ua.otherReason")
							+ "\",\"flag\":\"failure\"}]");
				}
			}
		} catch (IOException e) {
			log.info("registerUser:", e);
		}
		return null;
	}

	// 退出
	public String logout() {
		try {
			HttpSession session = request.getSession();
			session.invalidate();
			session = null;
		} catch (Exception ex) {
			log.info("系统退出", ex);
		}
		return LOGIN;
	}
}
