package com.ouyang.ua.domain;

public class MenuTree {

	private boolean isLeaf;//是否叶节点
	private String type;//类型
	private String level;//菜单级别
	private String parentIndex;//父节点索引
	private String index;//索引
	private String className;//html中的class属性值
	private String toPage;//节点toPage 对应html中跳转的值
	private String value;//节点的值
	public boolean isLeaf() {
		return isLeaf;
	}
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getToPage() {
		return toPage;
	}
	public void setToPage(String toPage) {
		this.toPage = toPage;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getParentIndex() {
		return parentIndex;
	}
	public void setParentIndex(String parentIndex) {
		this.parentIndex = parentIndex;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	
}
