<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="/jsp/common_miniui.jsp" %>
<html>
<head>
    <title>Hello, world!</title>
</head>
<body >
    <input id="helloBtn" class="mini-button" text="Hello" onclick="onHelloClick"/>
    <script type="text/javascript">
        function onHelloClick(e) {
            var button = e.sender;
            mini.alert("Hello MiniUI!");
        }
    </script>
</body>
</html>
