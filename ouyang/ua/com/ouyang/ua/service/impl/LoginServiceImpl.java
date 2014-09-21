package com.ouyang.ua.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.ouyang.ua.dao.UserDao;
import com.ouyang.ua.domain.User;
import com.ouyang.ua.exception.SaveException;
import com.ouyang.ua.exception.UAException;
import com.ouyang.ua.service.ILoginService;

public class LoginServiceImpl implements ILoginService {

	private static final Logger log=Logger.getLogger(LoginServiceImpl.class);
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User isUserExist(String loginName){
		try{
		List<User> userlist=userDao.queryUserByLoginName(loginName);
		if (userlist.size() == 1) {
			return userlist.get(0);
		} else if (userlist.size() > 1) {
			log.info("登陆用户" + loginName + "在表中有重复记录");
		}
		}catch(UAException e){
			log.info("登陆失败"+e.getLocalizedMessage());
		}
		return null;
	}
	public boolean isUserRegister(String loginName){
			List<User> userlist=userDao.queryUserByLoginName(loginName);
			if (userlist==null || userlist.size()==0) {
				return true;
			}else{
				return false;
			}
	}
	public boolean registerUser(User user) throws SaveException {
		return userDao.saveUser(user);
	}

}
