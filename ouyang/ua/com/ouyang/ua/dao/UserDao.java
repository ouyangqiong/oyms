package com.ouyang.ua.dao;

import java.util.List;

import org.apache.log4j.Logger;

import com.ouyang.common.dao.BaseDao;
import com.ouyang.ua.domain.User;
import com.ouyang.ua.exception.SaveException;

/**
 * 
 * @author 欧阳琼 2013-5-31
 */
public class UserDao extends BaseDao {
	private static final Logger log = Logger.getLogger(UserDao.class);
	public List<User> queryUserByLoginName(String loginName) {
		List<User> userlist=null;
		try {
			String hql = "from User user where user.loginName = ?";
			userlist = this.getHibernateTemplate().find(hql,
					new String[] { loginName });
		} catch (Exception ex) {
			log.info("queryUserByLoginName" + ex.getMessage());
		}
		return userlist;
	}

	public boolean saveUser(User user) throws SaveException {
		try {
			this.getHibernateTemplate().save(user);
			return true;
		} catch (Exception ex) {
			log.info("保存用户信息失败"+ex.getLocalizedMessage());
		}
		return false;
	}
}
