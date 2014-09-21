package com.ouyang.ua.service.impl;

import java.util.List;

import com.ouyang.ua.dao.MenuDao;
import com.ouyang.ua.domain.Menu;
import com.ouyang.ua.exception.UAException;
import com.ouyang.ua.service.IMenuService;

/**
 * @author 欧阳琼
 * 2013-7-7
 */
public class MenuServiceImpl implements IMenuService {

	private MenuDao menuDao;
	
	/* (non-Javadoc)
	 * @see com.ouyang.ua.service.IMenuService#getMenuListByDB()
	 */
	public MenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	@Override
	public List<Menu> getMenuListByDB(String id) throws UAException {
		return menuDao.getMenuListByParentId(id);
	}

}
