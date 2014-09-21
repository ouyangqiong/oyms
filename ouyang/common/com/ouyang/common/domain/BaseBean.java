/**
 * 
 */
package com.ouyang.common.domain;

import java.io.Serializable;

/**
 * @Description TODO(javabean的基类)
 * @author 欧阳琼
 * 2013-9-17
 */
public class BaseBean implements Serializable{
	private static final long serialVersionUID = -6231014077550283183L;
	private String id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
