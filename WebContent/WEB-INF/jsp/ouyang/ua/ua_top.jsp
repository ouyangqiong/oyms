<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String ctx=request.getContextPath();
//格式化当前时间
	java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy/MM/dd");
	String dateStr = df.format(new java.util.Date());
%>
<html>
	<script src="<%=ctx %>/js/oyms.js" type="text/javascript"></script>
	<div>
		<table style="border:1px;width:100%;">
		<tr>
			<td class="ltd"><span>emyhouse</span></td>
			<td class="rtd" style="width:20%;text-align:right;">
				[<a class="exitA" href="#" onclick="logout()"><s:text name="common.user.exit"/></a>]<br/>
				<span><img alt="用户" src="../images/se/user.png"></span>[<s:property  value="#session.user.userName"/>][<%=dateStr %>]
			</td>
		</tr>
		</table>
	</div>
</html>