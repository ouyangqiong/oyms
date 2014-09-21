<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><s:text name="ua.main.title"></s:text></title>
<script src="../js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="../js/ua/ua.js" type="text/javascript"></script>
<script src="../js/json.js" type="text/javascript"></script>
<script src="../js/jsonTool.js" type="text/javascript"></script>
<script src="../js/validata.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css"  href="../css/oyms.css"/>
<link rel="stylesheet" type="text/css" href="../css/ua/ua.css" />
<script type="text/javascript" event="onkeydown" for="document" >
	if(event.keyCode==13)
	{
		document.getElementById('btnLogin').click();
	}
</script>
</head>
<body>
<div id="loContDiv">
<div style="text-align:right">
	<%@include file="/jsp/i18n_navigator.jsp" %>
</div>
<table style="width:100%;">
	<tr>
		<td class="ltd">
			<div id="loAdDiv" style="text-align:center;">
				<img alt="advertisement" src="../images/ua/test.jpg" width="500px;height:600px;">
			</div>
		</td>
		<td class="rtd" width="30%;">
		<div id="loFormDiv" style="text-align:center;position:relative;top:100px;">
			<s:form id="loginForm" method="post" action="loginAction!login.action">
				<table id="loginTb">
					<caption><s:text name="ua.user.loginCaption"/></caption>
					<tr>
						<td colspan="2" class="errTd"><s:property value="#request.loginError"/>&nbsp;</td>
					</tr>
					<tr>
						<td class="ltd"><s:text name="ua.user.loginname"></s:text></td>
					</tr>
					<tr>
						<td class="ltd"><input class="labelLong" type="text" name="user.loginName"
							maxlength="16"/></td>
					</tr>
					<tr>
						<td class="ltd"><s:text name="ua.user.password"></s:text></td>
					</tr>
					<tr>
						<td class="ltd"><input class="labelLong" type="password" name="user.password"
							maxlength="16"/></td>
					</tr>
					<tr>
						<td class="ltd">
							<button class="btn" id="btnLogin" type="button"><s:text name="ua.user.btnLogin"/></button>
							<button class="btn" id="btnReg" type="button"><s:text name="ua.user.register"/></button>
						</td>
					</tr>
				</table>
		</s:form>
		</div>
		</td>
	</tr>
</table>
</div>
<div id="divFoot">
	 	<%@include file="/jsp/footer.jsp" %>
</div>
</body>
<div id="registerWindow" class="registerModal">
			<div style="text-align:right;background:#F0F0F0;margin:0;border 0px;">
				<span class="lspan"><font class="header" ><s:text name="ua.user.register"/></font></span>
				<a class="close" href="#" >
					<img src="../images/ua/close_button.png"  style="border:0;" alt="Close"/>
				</a>
			</div>
			<s:form id="registerForm">
				<table class="formTable">
					<tr>
						<td id="regErrTd" colspan="2" class="errTd"></td>
					</tr>
					<tr>
						<td class="rtd"><s:text name="ua.user.loginname"/></td>
						<td><input id="regLoginName" class="labelLong" type="text" name="user.loginName"/></td>
					</tr>
					<tr>
						<td class="rtd"><s:text name="ua.user.fullname"/></td>
						<td><input id="regUserName" class="labelLong" type="text" name="user.userName"/></td>
					</tr>
					<tr>
						<td class="rtd"><s:text name="ua.user.password" /></td>
						<td><input id="regPass" class="labelLong" type="password" name="user.password"/></td>
					</tr>
					<tr> 
						<td  colspan="2" style="text-align:center">
							<input class="btn" type="button" value="<s:text name="ua.user.register"/>" onclick='register()'/>
							<input class="btn" type="reset" value="<s:text name="ua.user.reset"/>"/>
						</td>
					</tr>
				</table>
			</s:form>
       </div>
<script type="text/javascript">
var ie6=!-[1,]&&!window.XMLHttpRequest;
$(document).ready(function() {
	$(":text,:password").focus(function(){
		$(this).addClass("blueBorder");
	});
	$(":text,:password").blur(function(){
		$(this).removeClass("blueBorder");
	});
	$("#btnReg").click(function() {
		$(".errspan").remove();
		$(".errTd").empty();
		if(ie6){
			$('body').append('<div id="modalShade"></div>');
			$('#loContDiv').css('display','none');
			$('#divFoot').css('display','none');
			$('#registerWindow').css('display','block');
		}else{
			$('body').append('<div id="modalShade"></div>');
			$('#modalShade').css('opacity','0.7').fadeIn();
			$('#registerWindow').css('display','block');
		}
		return false;
	});	
	$('a.close').live('click',regModuleClose);
	$("#btnLogin").click(function(){
		var form=$("#loginForm");
		form.method="post";
		form.action="loginAction!login.action";
		form.submit();
	});
});
function regModuleClose(){
	var thisModalId=$('a.close').parent().parent().attr('id');
	$('#modalShade,#'+thisModalId).fadeOut(function(){
		$('#modalShade').remove();
	});
	if(ie6){
		$('#'+thisModalId).css('display','none');
		$('#divFoot').css('display','block');
		$('#loContDiv').css('display','block');
		
	}
}
function register(){
	if(formCheck("registerForm")==true){
	}else{
		return false;
	}
	var jsonObj=$("#registerForm").simpleSerialize();
	//alert(JSON.stringify(jsonObj));
	//var userStr="({'user':"+JSON.stringify(jsonObj)+"})";
	//var jsonUser=eval(userStr);
	$.ajax({
		type:'post',
		url:'loginAction!registerUser.action',
		contentType: "application/x-www-form-urlencoded;charset=UTF-8", 
		data:jsonObj,
		dataType:'json',
		beforeSend:beforeCall,
		afterSend:afterCall,
		success:callback
	});
}
function beforeCall(){
	//alert("wait");
}
function afterCall(){
	alert("after Send");
}
function callback(data){
	var flag=data[0].flag;
	if(flag=="success"){
		alert(data[0].regInfo);
		regModuleClose();
	}else{
		$("#regErrTd").text(data[0].regInfo);
	}	
}
</script>
</html>