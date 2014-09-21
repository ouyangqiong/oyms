<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../js/jquery-1.7.2.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="../css/oyms.css" />
<link href="../css/styles/gray/grayStyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../css/musicbar/musicbar.css" />
</head>
<body>
	<!-- 顶部标题部分 -->
		<div id="north" class="oyms-header">
			<jsp:include page="music_top.jsp" />
		</div>
<!--包含导航栏-->
<s:action name="song!navigation" executeResult="true" flush="true" namespace="/musicbar" >
</s:action>
<table style="margin:auto;width:899px;border:1px solid gray;">
	<tr>
		<td>
			<div id="index_left">
	<img style="width:728px;height:90px;" src="../images/musicbar/music_banner.gif">	
   <s:iterator value="#request.songMap" id="entry" status="st">
   	<s:if test="#st.index%2==0">
  		 <table>
   	 		<tr>
   				<td><%@include file="music_songList.jsp"%></td>
   	</s:if>
     <s:else>
      			<td><%@include file="music_songList.jsp"%></td>
      		</tr>
  		</table>
  		<br> 
      </s:else>	
  </s:iterator>
  </div>
		</td>
		<td>
			 <div id="index_right">
  	<table>
    <caption>
      <span >试听排行榜</span>
    </caption>
    <tr>
      <td>
      <s:action name="song!songSort" namespace="/musicbar" executeResult="true">
     	 <s:param name="sortType">hits</s:param>
      </s:action> 
 	</td>
    </tr>
  </table>
  	 <table>
   	 <caption>
     	 <span >下载排行榜</span>
     </caption>
    <tr>
      <td>
       <s:action name="song!songSort" namespace="/musicbar" executeResult="true">
     	 <s:param name="sortType">download</s:param>
      </s:action>  
	 </td>
    </tr>
  </table>
  </div>
		</td>
	</tr>
</table>
</body>
<jsp:include page="/jsp/musicbar/music_copyright.jsp"/>
<script type="text/javascript">
<!--
	$(document).ready(function(){
		$(".bar span").live('mouseover',function(){
			$(this).css("background","#20619F");
		});
		$(".bar span").live('mouseout',function(){
			$(this).css("background","#256DB2");
		});
	});
	function tryListen(id){
		window.open('song!tryListen.action?songId='+id,{doc:document,win:parent},
				'dialogWidth=500px;dialogHeight=360px;status:no');
	}
	function checkAll(elementsA,elementB){
		if(elementB.checked==false)
		{
			for(var j=0;j<elementsA.length;j++){
				elementsA[j].checked=false;
			}
		}else{
			for(var i=0;i<elementsA.length;i++)
			{
				elementsA[i].checked=true;
			}
		}
	}
-->
</script>
</html>