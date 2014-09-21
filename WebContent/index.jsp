<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String ctx=request.getContextPath();
%>
<html>
<head>
<title></title>
</head>
<body onLoad="init();">
	<div style="position:absolute;top:50%;left:50%;margin-left:-100px;margin-top:-36px;text-align:center;width:222px;height:58px;">
		<span style="height:32px;width:222px; text-align:center;font:9pt;">正在努力加载,请稍候</span>
		<img src="<%=ctx%>/images/loading.gif" border="0"/>
	</div>
</body>
	<script type="text/javascript">
		function toLogin(url){
			var browser=navigator.appName;
			//支持火狐浏览器的打开界面关闭本界面
			if(browser=="Netscape"){
				window.open(url,"_parent",'width='+screen.availWidth+',height='+(screen.availHeight)+',menubar=0,scrollbars=0,toolbar=0,status=0,resizable=0,left=0,top=0'); 
				window.close(); 
			}else{
			//window.navigate(url);
			//location.href=url;
			window.open(url,"",'width='+screen.availWidth+',height='+(screen.availHeight)+',menubar=0,scrollbars=0,toolbar=0,status=0,resizable=0,left=0,top=0');
			window.opener=null;   
			window.open("","_self");   
			window.close(); 
			}			
		};
		function init(){
			//跳转登陆界面
			//var url="<%=ctx%>/console/loginAction!loginPage.action";
			//跳转论坛界面
			var url="<%=ctx%>/console/menuEvent!toBBSMain.action";
			setTimeout(toLogin(url),1000);
		}
	</script>
</html>