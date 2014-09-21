package com.ouyang.ua.action;

import java.io.PrintWriter;
import java.util.List;

import org.apache.log4j.Logger;

import com.ouyang.common.action.OymsAction;
import com.ouyang.common.util.JSONTool;
import com.ouyang.ua.domain.Menu;
import com.ouyang.ua.service.IMenuService;

/**
 * @author 欧阳琼
 * 2013-7-7
 */
public class DBTreeAction extends OymsAction{

	private static final long serialVersionUID = -5019304734613215338L;
	private static final Logger log=Logger.getLogger(DBTreeAction.class);
	private IMenuService menuService;
	
	public IMenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(IMenuService menuService) {
		this.menuService = menuService;
	}

	public String getSubTree(){
		try{
			response.setContentType("application/json;charset=utf-8");
			String parentId=request.getParameter("parentId");
			PrintWriter out=null;
			out=response.getWriter();
			List<Menu> list=menuService.getMenuListByDB(parentId);
			String jsonstr= JSONTool.list2json(list);
			out.print(jsonstr);
		}catch(Exception e){
			log.info("根据parentId获取菜单列表失败",e);	
			e.printStackTrace();
		}
		return null;
	}
}
