<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String ctx = request.getContextPath();
%>
<link href="<%=ctx %>/css/styles/gray/grayStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=ctx %>/miniui/boot.js"></script>
<script type="text/javascript">
 //将html标签解析为miniui控件。解析后，才能使用mini.get获取到控件对象
    	mini.parse();
</script>