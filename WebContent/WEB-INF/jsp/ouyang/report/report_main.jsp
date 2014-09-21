<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
	<head>
		<title>报表主页</title>
		<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#btnReport").click(function(){
					location.href="reportPDF!toPDFReport.action";
				});
			});
		</script>	
	</head>
	<body>
		<input  id="btnReport" type="button" value="报表打印" />
	</body>
</html>