<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>菜单管理</title>
<link href="../css/oyms.css" rel="stylesheet" type="text/css" />
<link href="../css/ua/ua.css" rel="stylesheet" type="text/css" />
<link href="../css/tree.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/ua/ua.js"></script>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/tree.js"></script>
<script type="text/javascript">
$(function(){
	loadTreeXmlForMenuMgr();
	$("#btnLeaf").bind('click',function(){
		updateLeaf();
	});
	$("#btnNoleaf").bind('click',function(){
		updateNoleaf();
	});
});
</script>
</head>
<body>
	<div id="treeDiv" style="position:absolute;width:19%;height:500px;">
	</div>
	<div id="treeCfgDiv">
	<s:hidden id="oldNameStr" />
	<form id="leafForm">
	<div  id="leafCfgDiv">	
		<table>
			<tr>
				<td class="rtd">名称:</td><td class="ltd"><input id="leafValueId" class="leafInput" type="text" name="menuTree.value" maxlength="40" size="40"/></td>
			</tr>
			<tr>
				<td class="rtd">事件:</td><td class="ltd"><input id="leafToPageId" class="leafInput" type="text" name="menuTree.toPage" maxlength="50" size="40" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;"> <input class="btn" type="reset" value="重置" /><input id="btnLeaf" class="btn" type="button" value="确定"/></td>
			</tr>
		</table>
	</div>
	</form>
	<form id="noleafForm">
	<div  id="noleafCfgDiv">
		<table>
			<tr>
				<td class="rtd">名称:</td><td class="ltd"><input id="noleafValueId" class="leafInput" type="text" name="menuTree.value" maxlength="40" size="40"/></td>
			</tr>
			<tr>
				<td class="rtd">级别:</td><td class="ltd"><input id="noleafLevelId" class="leafInput" type="text" name="menuTree.level" maxlength="50" size="40" /></td>
			</tr>
			<tr>
				<td class="rtd">父节点索引:</td><td class="ltd"><input id="noleafParentIndexId" class="noleafInput" type="text" name="menuTree.parentIndex"  maxlength="40"/></td>
			</tr>
			<tr>
				<td class="rtd">索引:</td><td class="ltd"><input id="noleafIndexId" class="noleafInput" type="text" name="menuTree.index"  maxlength="40"/></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;"><input class="btn" type="reset" value="重置" /><input id="btnNoleaf" class="btn" type="button" value="确定" /></td>
			</tr>
		</table>
		
	</div>
	</form>
	</div>
</body>
</html>