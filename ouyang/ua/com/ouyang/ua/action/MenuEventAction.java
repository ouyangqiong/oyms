package com.ouyang.ua.action;

import com.ouyang.common.action.OymsAction;

/**
 * 
 * @Description TODO(菜单树管理)
 * @author 欧阳琼
 * 2013-7-29
 */
public class MenuEventAction extends OymsAction{

	private static final long serialVersionUID = 3685046071943438313L;
	//跳转主面
	public String toMain(){
		return "menuMain";
	}
	//跳转菜单管理界面
	public String toMenuMgr(){
		return "menuMgr";
	}
	//软考资料管理
	public String toSEMain(){
		return "seMain";
	}
	//电子布告栏系统BBS
	public String toBBSMain(){
		return "bbsMain";
	}
	//报表打印
	public String toReportMain(){
		return "reportMain";
	}
	//报表打印
	public String toMusicbarMain(){
		return "musicbar";
	}
}
