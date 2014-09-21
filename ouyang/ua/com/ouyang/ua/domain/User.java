package com.ouyang.ua.domain;

/**
 * 
 * @author 欧阳琼 2013-5-30
 */
public class User {
	
	private String id;
	private String loginName;
	private String userName;
	private String password;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
