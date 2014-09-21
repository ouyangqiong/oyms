<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>分系统选择</title>
<link rel="stylesheet" type="text/css" href="../extjs/resources/css/ext-all-gray.css" />
<link href="../css/styles/gray/grayStyle.css" rel="stylesheet" type="text/css" />
<link href="../css/ua/ua.css" rel="stylesheet" type="text/css" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/interface.js"></script>
<script type="text/javascript" src="../extjs/bootstrap.js"></script>
<script type="text/javascript">
Ext.require('Ext.tab.*');
Ext.onReady(function(){
	var tree=Ext.create('Ext.tree.Panel',{
		renderTo: 'treeDiv',
	    title: '系统菜单',
	    rootVisible: false,
	    width: 250,
	    height: 500
	});
	tree.setRootNode({
		text:'root'
	});
	var root=tree.getRootNode();
	getChild(root,0);
});
function getChild(parent,pid){
	Ext.Ajax.request({
		url:'dbTree!getSubTree.action',
		params:{parentId:pid},
		success:function(resp,opts){
			var json=Ext.decode(resp.responseText);
				for(i=0;i<json.length;i++){
					addChild(parent,json[i],pid);
				}
		},
		failure:function(){
			Ext.MessageBox.alert("信息提示","加载数失败");
		},
		method:'post'
	});
}
function addChild(node,obj,pid){
	if(obj.leaf=="true"){
		var tt=node.appendChild({
			text:obj.name,
			leaf:true,
			href:obj.event,
			hrefTarge:'sspMainDiv'
		});
	}else{
		var parent=node.appendChild({
			text:obj.name,
			expand:true
		});
		getChild(parent,obj.id);
	}
}
/*
var tabs = Ext.widget('tabpanel', {
    renderTo: 'tabs1',
    width: 450,
    activeTab: 0,
    defaults :{
        bodyPadding: 10
    },
    items: [{
        contentEl:'itemPanel1', 
        title: 'Short Text',
        closable: true
    },{
        contentEl:'itemPanel2', 
        title: 'Long Text'
    }]
});
function getTree(pid){
	Ext.Ajax.request({
		url:'dbTree!getSubTree.action',
		params:{parentId:pid},
		success:function(resp,opts){
			var json=Ext.decode(resp.responseText);
				for(i=0;i<json.length;i++){
					root.appendChild({
						text:json[i].name,
						leaf:json[i].leaf
					});
				}
		},
		failure:function(){
			Ext.MessageBox.alert("信息","加载菜单树失败！");
		},
		method:'post'
	});	
}
*/

</script>
</head>
<body>
		
	<div>
		<!-- 顶部标题部分 -->
		<div id="north" class="oyms-header">
			<jsp:include page="ua_top.jsp" />
		</div>
		<!-- 菜单树 -->
		<div id="east">
			<div id="treeDiv" style="position:absolute;left:2px;z-index:1;width:250px;height:500px;">
	   		 </div>
		</div>
	
		<!-- 正文 -->
		<div id="west">
			<div id="sspMainDiv" style="height:500px;">
				 <iframe id="mainIFrame" src="menuEvent!toMain.action" width="100%;" height="100%;" frameborder="0" marginheight="0px" marginwidth="0px" ></iframe>
				
			</div>
		</div>
		<!-- 底部版权部分 -->
		<div id="south" style="position:relative;margin-bottom:0px;">
			<%@include file="/jsp/footer.jsp" %>
		</div>
	</div>
<!--top dock
<div class="dock" id="dock">
  <div class="dock-container">
	  <a class="dock-item" href="#"><img src="../images/home.png" alt="home" /><span>Home</span></a> 
	  <a class="dock-item" href="#"><img src="../images/email.png" alt="contact" /><span>Contact</span></a> 
	  <a class="dock-item" href="#"><img src="../images/portfolio.png" alt="portfolio" /><span>Portfolio</span></a> 
	  <a class="dock-item" href="#"><img src="../images/music.png" alt="music" /><span>Music</span></a> 
	  <a class="dock-item" href="#"><img src="../images/video.png" alt="video" /><span>Video</span></a> 
	  <a class="dock-item" href="#"><img src="../images/history.png" alt="history" /><span>History</span></a> 
	  <a class="dock-item" href="#"><img src="../images/calendar.png" alt="calendar" /><span>Calendar</span></a> 
	  <a class="dock-item" href="#"><img src="../images/rss.png" alt="rss" /><span>RSS</span></a>
	  <a class="dock-item" href="#"><img src="../images/rss.png" alt="rss" /><span>RSS</span></a> 
	  <a class="dock-item" href="#"><img src="../images/rss2.png" alt="rss" /><span>RSS2</span></a>
  </div> 
</div>
 -->
<!--bottom dock
<div class="dock" id="dock2" style="border:0px;">
  <div class="dock-container2">
	  <a class="dock-item2" href="#"><span>Home</span><img src="../images/home.png" alt="home" /></a> 
	  <a class="dock-item2" href="#"><span>Contact</span><img src="../images/email.png" alt="contact" /></a> 
	  <a class="dock-item2" href="#"><span>Portfolio</span><img src="../images/portfolio.png" alt="portfolio" /></a> 
	  <a class="dock-item2" href="#"><span>Music</span><img src="../images/music.png" alt="music" /></a> 
	  <a class="dock-item2" href="#"><span>Video</span><img src="../images/video.png" alt="video" /></a> 
	  <a class="dock-item2" href="#"><span>History</span><img src="../images/history.png" alt="history" /></a> 
	  <a class="dock-item2" href="#"><span>Calendar</span><img src="../images/calendar.png" alt="calendar" /></a> 
	  <a class="dock-item2" href="#"><span>Links</span><img src="../images/link.png" alt="links" /></a> 
	  <a class="dock-item2" href="#"><span>RSS</span><img src="../images/rss.png" alt="rss" /></a> 
	  <a class="dock-item2" href="#"><span>RSS2</span><img src="../images/rss2.png" alt="rss" /></a> 
  </div>
</div>
 -->
<!--dock menu JS options -->
<script type="text/javascript">	
	$(document).ready(
		//function()
		//{
			//$('#dock').Fisheye(
			//	{
			//		maxWidth: 50,
			//		items: 'a',
			//		itemsText: 'span',
			//		container: '.dock-container',
			//		itemWidth: 40,
			//		proximity: 90,
			//		halign : 'center'
			//	}
			//);
			//$('#dock2').Fisheye(
			//	{
			//		maxWidth: 60,
			//		items: 'a',
			//		itemsText: 'span',
			//		container: '.dock-container2',
			//		itemWidth: 80,
			//		proximity: 80,
			//		alignment : 'left',
			//		valign: 'middle',
			//		halign : 'center'
			//	}
			//);
		//}
	);
</script>
</body>
</html>
