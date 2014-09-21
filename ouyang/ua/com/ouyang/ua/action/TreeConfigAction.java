package com.ouyang.ua.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;
import org.dom4j.Document;

import com.ouyang.common.action.OymsAction;
import com.ouyang.ua.domain.MenuTree;
import com.ouyang.ua.service.IMenuTreeService;
/**
 * @author 欧阳琼
 * 2013-7-3
 * 用途:更改菜单树配置文件(xml版本)
 */
public class TreeConfigAction extends OymsAction {
	private static final Logger log=Logger.getLogger(TreeConfigAction.class);
	private static final long serialVersionUID = 1370205948123732038L;
	private MenuTree menuTree;
	private IMenuTreeService menuTreeService;
	
	public IMenuTreeService getMenuTreeService() {
		return menuTreeService;
	}
	public void setMenuTreeService(IMenuTreeService menuTreeService) {
		this.menuTreeService = menuTreeService;
	}
	public MenuTree getMenuTree() {
		return menuTree;
	}
	public void setMenuTree(MenuTree menuTree) {
		this.menuTree = menuTree;
	}
	//返回xml文件给界面生成树形菜单
	public void getTreeXml(){
		response.setContentType("text/xml;charset=utf-8");
		Document doc=menuTreeService.getMenuTreeDocument();
		PrintWriter out=null;
		try {
			out = response.getWriter();
			doc.write(out);
		} catch (IOException e) {
			log.info("获取输出流异常!",e);
		}
	}
	//更新菜单树
	public String updateTree(){
		response.setContentType("text/xml;charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			log.info("编码不支持utf-8",e);
		}
		menuTreeService.updateTreeMenu(menuTree);
		return "updateSuccess";
	}
	
}
