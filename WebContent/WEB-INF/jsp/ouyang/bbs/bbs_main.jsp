<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@include file="/jsp/common_miniui.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>BBS论坛</title>
</head>
<body>
	<div class="mini-splitter" style="width:100%;height:100%;" vertical="true" allowResize="false">
    	<div size="72" showCollapseButton="false" class="oyms-header">
        	<jsp:include page="bbs_top.jsp" />
   		 </div>
    	<div showCollapseButton="false">
        <div id="layout1" class="mini-layout" style="width:100%;height:100%;text-align:center;" bodyStyle="border:solid 1px #aaa">
    	<div title="north" region="north" showHeader="false" height="35" showSplitIcon="false" allowResize="false">
    		<div class="mini-toolbar">
    			<a class="mini-button" plain="true">论坛首页</a>
    			 <span class="separator"></span>
    			<a class="mini-button" plain="true">网络文学</a>
    			 <span class="separator"></span>
			    <a class="mini-button" plain="true">娱乐八卦</a>
			    <span class="separator"></span>
			    <a class="mini-button" plain="true">影视评论</a>
			    <span class="separator"></span>
			    <a class="mini-button" plain="true">音乐天地</a>
			    <span class="separator"></span>
			    <a class="mini-button" plain="true">开心乐园</a>
			    <span class="separator"></span>   
			    <a class="mini-button" plain="true">贴图专区</a>
			    <span class="separator"></span>   
			    <a class="mini-button" plain="true">IT社区</a>
			</div>

    	</div>
    	<div title="south" region="south" showSplit="true" showSplitIcon="false" showHeader="false" allowResize="false">
    		<%@include file="/jsp/footer.jsp" %>
    	</div>
    	<div title="west" region="west" showSplitIcon="true" allowResize="false" showHeader="false">
    		 <div id="leftTree" class="mini-outlooktree" url="" onnodeclick="onNodeSelect"
                    textField="text" idField="id" parentField="pid">
             </div>
    	</div>
    	<div title="center" region="center" showCloseButton="true" showSplitIcon="false" allowResize="false">
    		 <!--Tabs-->
                <div id="mainTabs" class="mini-tabs" activeIndex="2" style="width:100%;height:100%;"      
                     plain="false" onactivechanged="onTabsActiveChanged">
                    <div title="首页" url="bbs!firstPage.action" >  
                    	
                    </div>
                    <div title="子页面关闭" url="" >        
                    </div>
                    <div title="弹出面板" url="" > 
                    	       
                    </div>
                    <div title="弹出面板" url="" >        
                    </div>
                </div>
    	</div>
    </div>
    	</div>        
	</div>


</body>
</html>
