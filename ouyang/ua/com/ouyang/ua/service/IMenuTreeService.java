package com.ouyang.ua.service;

import org.dom4j.Document;

import com.ouyang.ua.domain.MenuTree;

public interface IMenuTreeService {

	public Document getMenuTreeDocument();
	public boolean updateTreeMenu(MenuTree menuTree);
}
