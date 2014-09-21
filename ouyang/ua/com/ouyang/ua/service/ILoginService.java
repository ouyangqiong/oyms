package com.ouyang.ua.service;

import com.ouyang.ua.domain.User;
import com.ouyang.ua.exception.SaveException;

public interface ILoginService {

	/**
	 * @Description(判断用户是否存在)
	 * @param loginName
	 * @return
	 */
	public User isUserExist(String loginName);
	/**
	 *  @Description(判断用户是否可注册)
	 * @param loginName
	 * @return
	 */
	public boolean isUserRegister(String loginName);
	
	public boolean registerUser(User user) throws SaveException;
}
