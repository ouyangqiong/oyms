<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String ctx=request.getContextPath();
 %>
<script src="<%=ctx %>/js/oyms.js" type="text/javascript"></script>
<div>
<table style="border:1px;width:100%;">
		<tr>
			<td class="ltd"><span><img src="../images/musicbar/logo_musicbar.png"/></span></td>
			<td class="rtd" style="width:20%;"><span><img alt="用户" src="../images/se/user.png"></span>[<s:property  value="#session.user.userName"/>][<a class="exitA" href="#" onclick="logout()"><s:text name="common.user.exit"/></a>]</td>
		</tr>
</table>
</div>