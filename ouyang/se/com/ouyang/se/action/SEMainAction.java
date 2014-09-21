/**
 * 
 */
package com.ouyang.se.action;

import org.apache.log4j.Logger;

import com.ouyang.common.action.OymsAction;

/**
 * @Description TODO(软考资料管理)
 * @author 欧阳琼
 * 2013-8-22
 */
public class SEMainAction extends OymsAction{
	private static final long serialVersionUID = 8254843434161780441L;
	private static final Logger log=Logger.getLogger(SEMainAction.class);
	//集成项目管理 信息化基础知识
	public String toProjectMgrFirst(){
		return "baseInfo";
	}
}
