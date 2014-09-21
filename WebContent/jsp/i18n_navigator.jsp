<%@page pageEncoding="UTF-8"%>
<!-- 国际化导航栏按钮 -->
<html>
	<script type="text/javascript">
		var i18n={};
		/**更改系统国际化语言
		*参数:url(跳转地址)
		*参数:locale(本地化信息） eg:简体中文(zh_CN),美国英文
		*/
		i18n.changeLanguage=function(url,locale){
			location.href=url+"?locale="+locale;
		};
		/**更改系统国际化语言(默认跳转地址  登陆界面)
		*参数:locale(本地化信息） eg:简体中文(zh_CN),美国英文
		*/
		i18n.loginCL=function(locale){
			i18n.changeLanguage("loginAction!loginPage.action",locale);
		};
	</script>
	<div id="i18nDiv">
		<img class="imgBtn" alt="zh" id="zhbtn" onclick="i18n.loginCL('zh_CN')" src="../images/ua/zh_CN.png" style="width:25px;heigth:25px;">
		<img class="imgBtn" alt="en" id="enbtn" onclick="i18n.loginCL('en_US')" src="../images/ua/en_US.png" style="width:25px;heigth:25px;">
	</div>
</html>

