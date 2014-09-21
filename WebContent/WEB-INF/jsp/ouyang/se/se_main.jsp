<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../js/jquery-1.7.2.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="../css/oyms.css" />
<link rel="stylesheet" type="text/css" href="../css/se/se.css" />
</head>
<body class="se_body">
<div class="banner">
<table style="border:1px;width:100%;">
	<tr>
		<td class="ltd"><span><img src="../images/logo.png"/></span></td>
		<td style="background:pink;"></td>
		<td class="rtd" style="width:20%;"><span><img alt="用户" src="../images/se/user.png"></span>[<s:property  value="#session.user.userName"/>] 软考首页 [<s:text name="common.user.exit"/>]</td>
	</tr>
</table>
</div>
<div class="se_main">
<table>
	<tr>
		<td class="menuTd">
		<div class="se_menu">
		<table id="se_menuTable" class="menuTable" cellspacing="0" cellpadding="1" style="border : 1px solid black;">
			<caption>系统集成项目管理工程师</caption>
			<tr>
				<td>第一章</td>
				<td><a href="#">信息化基础知识</a></td>
			</tr>
			<tr>
				<td>第二章</td>
				<td>信息系统服务管理</td>
			</tr>
			<tr>
				<td>第三章</td>
				<td>信息系统集成专业技术</td>
			</tr>
			<tr>
				<td>第四章</td>
				<td>法律法规与标准规范</td>
			</tr>
			<tr>
				<td>第五章</td>
				<td>项目管理一般知识</td>
			</tr>
			<tr>
				<td>第六章</td>
				<td>项目立项与招投标管理</td>
			</tr>
			<tr>
				<td>第七章</td>
				<td>项目整理管理</td>
			</tr>
			<tr>
				<td>第八章</td>
				<td>项目范围管理</td>
			</tr>
			<tr>
				<td>第九章</td>
				<td>项目进度管理</td>
			</tr>
			<tr>
				<td>第十章</td>
				<td>项目成本管理</td>
			</tr>
			<tr>
				<td>第十一章</td>
				<td>项目质量管理</td>
			</tr>
			<tr>
				<td>第十二章</td>
				<td>项目人力资源管理</td>
			</tr>
			<tr>
				<td>第十三章</td>
				<td>项目沟通管理</td>
			</tr>
			<tr>
				<td>第十四章</td>
				<td>项目合同管理</td>
			</tr>
			<tr>
				<td>第十五章</td>
				<td>项目采购管理</td>
			</tr>
			<tr>
				<td>第十六章</td>
				<td>文档与配置管理</td>
			</tr>
			<tr>
				<td>第十七章</td>
				<td>项目变更管理</td>
			</tr>
			<tr>
				<td>第十八章</td>
				<td>信息系统安全管理</td>
			</tr>
			<tr>
				<td>第十九章</td>
				<td>项目风险管理</td>
			</tr>
			<tr>
				<td>第二十章</td>
				<td>项目收尾管理</td>
			</tr>
			<tr>
				<td>第二十一章</td>
				<td>知识产权管理</td>
			</tr>
		</table>
		</div>
	  </td>
	  <td class="contentTd">
			Test
	  </td>
</table>
</div>
<div class="se_footer">
	<%@include file="/jsp/footer.jsp" %>
</div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		$(".menuTable tr").focusin(function(){
			$("#se_menuTable tr").removeClass("focusTr");
			$(this).addClass("focusTr");
		});
	});
</script>
<script language="javascript" for="document" event="onkeydown">
if(event.keyCode==40){
	var obj=$(".focusTr");
	var nextObj=obj.next();
	if(nextObj.is('tr')){
	 	nextObj.focus();	
	}
}
if(event.keyCode==38){
	var obj=$(".focusTr");
	var prevObj=obj.prev();
	if(prevObj.is('tr')){
		prevObj.focus();	
	}
}
</script>
</html>
