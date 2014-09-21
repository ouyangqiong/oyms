<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path=request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css">
	<script type="text/javascript" src="extjs/bootstrap.js"></script>
	<script type="text/javascript">
		Ext.onReady(function(){
			 Ext.MessageBox.alert('test', 'Are you sure you want to do that?');			 
		});
	</script>
</head>
<body>
	<div style="position:absolute;top:50%;left:50%;margin-left:-100px;margin-top:-36px;text-align:center;width:222px;height:58px;">
		<span style="height:32px;width:222px; text-align:center;font:9pt;">正在努力加载,请稍候</span>
		<img src="<%=path%>/images/loading.gif" border="0"/>
	</div>
</body>
</html>