<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登出界面</title>
<LINK href="../css/oyms.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
<script type="text/javascript">
		function logout(){
			parent.location.href = "<%=request.getContextPath() %>/console/loginAction!loginPage.action";			
		}
	</script>
</head>
<body>
<div style="width:100%;height:100%;background:#E8F2FE;text-align:center;vertical-align:middle;">
<table class="exitTb">
	<caption>系统提示信息</caption>
	<tr>
		<td style="height:140px;vertical-align:middle;">
		<table width="100%" height="100%">
			<tr>
				<td style="vertical-align:middle;"><img src="../images/message_03.gif" width="32px" height="32px" /></td>
				<td style="vertical-align:middle;"><b>错误:</b>当前用户登录已经过期,请退出后重新登录!</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td class=t_35 style="height: 20px" align="center"><input
			type="button" value="退出系统 " class="btn" onclick="logout()" /></td>
	</tr>
</table>
</div>
</body>
</html>
