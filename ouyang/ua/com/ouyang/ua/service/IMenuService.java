package com.ouyang.ua.service;

import java.util.List;

import com.ouyang.ua.domain.Menu;
import com.ouyang.ua.exception.UAException;

/**
 * 数据库菜单树
 * @author 欧阳琼
 * 2013-7-7
 */
public interface IMenuService {
	public List<Menu> getMenuListByDB(String id) throws UAException;
}
