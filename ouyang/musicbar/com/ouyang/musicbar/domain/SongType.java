/**
 * 
 */
package com.ouyang.musicbar.domain;

import com.ouyang.common.domain.BaseBean;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-17
 */
public class SongType extends BaseBean{

	private String typeName;//类别编号
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
