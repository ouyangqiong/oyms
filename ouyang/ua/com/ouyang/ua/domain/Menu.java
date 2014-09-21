package com.ouyang.ua.domain;
/**
 * 
 * @Description TODO(菜单树)
 * @author 欧阳琼
 * 2013-7-31
 */
public class Menu {
	private String id;
	private String parentId;//父亲节点id
	private String name;
	private boolean leaf;
	private String event;
	private String menuLayerMark;//层级 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getMenuLayerMark() {
		return menuLayerMark;
	}
	public void setMenuLayerMark(String menuLayerMark) {
		this.menuLayerMark = menuLayerMark;
	}
	
}
