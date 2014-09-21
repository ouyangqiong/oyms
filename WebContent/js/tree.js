function loadTreeXml(){
	$.ajax({       
		 url: "treeConfig!getTreeXml.action",  
		 dataType:'xml',
		 type:'POST',
		 error:function(xml){
		 	alert("加载XML文件出错！");
		 },
		 success:function(xml){
			 var treeRoot=$(xml).find("tree");
			 $("#treeDiv").append("<ul class='"+treeRoot.attr("className")+"'></ul>");
			 var treeRootHtml= $("#treeDiv").children("."+treeRoot.attr("className"));
			 printTree(treeRootHtml,treeRoot);
			 $(".treeTitle").next().css("display","none");;
			 $(".treeTitle").toggle(function(){
				 $(this).next().css("display","block");
				 $(this).css("background","url(../images/folder-open.gif) no-repeat 0px 50%;");
			 },function(){
				 $(this).next().css("display","none");
				 $(this).css("background","url(../images/folder.gif) no-repeat 0px 50%;");
			 });
		 },
		 complete:function(XHR,textStatus){
			 XHR=null;
		 }   
	});
}
function printTree(treeParentHtml,treeParent){
	treeParent.children("noleaf").each(function(i){
		var noleaf=$(this);
		var index=$(this).attr("index");
		var parentIndex=$(this).attr("parentIndex");
		var level=$(this).attr("level");
		var id="level_"+level+"_index_"+index;//eg:level_1_index_1
		if(level==1){
			treeParentHtml.append("<li id='"+id+"'class='"+noleaf.attr("className")+"'></li>");
			var noleafHtml=treeParentHtml.children('.noleaf').eq(i);
			var treeTitle=noleaf.children('treeTitle');
			noleafHtml.append("<span class='"+treeTitle.attr("className")+"'>"+treeTitle.text()+"</span>");
			var treeTxt=noleaf.children('treeTxt');
			noleafHtml.append("<ul class='"+treeTxt.attr("className")+"'></ul>");
			var treeTxtHtml=noleafHtml.children(".treeTxt");
		}else{
			var parentId="level_"+(level-1)+"_index_"+parentIndex; 
			$("#"+parentId).children("ul").append("<li id='"+id+"'class='"+noleaf.attr("className")+"'></li>");
			var noleafHtml=$("#"+id);
			var treeTitle=noleaf.children('treeTitle');
			noleafHtml.append("<span class='"+treeTitle.attr("className")+"'>"+treeTitle.text()+"</span>");
			var treeTxt=noleaf.children('treeTxt');
			noleafHtml.append("<ul class='"+treeTxt.attr("className")+"'></ul>");
			var treeTxtHtml=noleafHtml.children(".treeTxt");
		}
		
		printLeaf(treeTxtHtml,treeTxt);
	});
	printLeaf(treeParentHtml,treeParent);
}
function printLeaf(treeParentHtml,treeParent){
	treeParent.children("leaf").each(function(i){
		var toPage=$(this).attr("toPage");
		treeParentHtml.append("<li class='"+ $(this).attr("className")+"'>"+$(this).text()+"</li>");
		var leafHtml=treeParentHtml.children(".leaf").eq(i);
		leafHtml.bind('click',function(){
			$("#mainIFrame").attr("src",toPage);
		});
	});
}
//用于菜单管理 
function loadTreeXmlForMenuMgr(){
	$.ajax({       
		 url: "treeConfig!getTreeXml.action",  
		 dataType:'xml',
		 type:'POST',
		 error:function(xml){
		 	alert("加载XML文件出错！");
		 },
		 success:function(xml){
			 var treeRoot=$(xml).find("tree");
			 $("#treeDiv").append("<ul class='"+treeRoot.attr("className")+"'></ul>");
			 var treeRootHtml= $("#treeDiv").children("."+treeRoot.attr("className"));
			 printTreeForMenuMgr(treeRootHtml,treeRoot);
			 $(".leaf").bind('click',function(){
				 $("#leafCfgDiv").css("display","block");
				 $("#noleafCfgDiv").css("display","none");
				 $("#oldNameStr").val($(this).text());
				 $("#leafValueId").val($(this).text());
				 $("#leafToPageId").val($(this).children("input").val());
			 });
			 $(".treeTitle").next().next().css("display","none");;
			 $(".treeTitle").toggle(function(){
				 $("#leafCfgDiv").css("display","none");
				 $("#noleafCfgDiv").css("display","block");
				 $("#oldNameStr").val($(this).text());
				 $("#noleafValueId").val($(this).text());
				 var level=$(this).parent().attr("id").split('_')[1];
				 var index=$(this).parent().attr("id").split('_')[3];
				 $("#noleafLevelId").val(level);
				 $("#noleafIndexId").val(index);
				 $("#noleafParentIndexId").val($(this).next().val());
				 $(this).next().next().css("display","block");
				 $(this).css("background","url(../images/folder-open.gif) no-repeat 0px 50%;");
			 },function(){
				 $("#leafCfgDiv").css("display","none");
				 $("#noleafCfgDiv").css("display","block");
				 $("#oldNameStr").val($(this).text());
				 $("#noleafValueId").val($(this).text());
				 $("#noleafLevelId").val($(this).attr("level"));
				 $("#noleafIndexId").val($(this).attr("index"));
				 $("#noleafParentIndexId").val($(this).attr("parentIndex"));
				 $(this).next().next().css("display","none");
				 $(this).css("background","url(../images/folder.gif)  no-repeat 0px 50%;");
			 });
		 },
		 complete:function(XHR,textStatus){
			 XHR=null;
		 }   
	});
}
function printTreeForMenuMgr(treeParentHtml,treeParent){
	treeParent.children("noleaf").each(function(i){
		var noleaf=$(this);
		var index=$(this).attr("index");
		var parentIndex=$(this).attr("parentIndex");
		var level=$(this).attr("level");
		var id="level_"+level+"_index_"+index;//eg:level_1_index_1
		if(level==1){
			treeParentHtml.append("<li id='"+id+"'class='"+noleaf.attr("className")+"'></li>");
			var noleafHtml=treeParentHtml.children('.noleaf').eq(i);
			var treeTitle=noleaf.children('treeTitle');
			noleafHtml.append("<span class='"+treeTitle.attr("className")+"'>"+treeTitle.text()+"</span>");
			noleafHtml.append("<input type='hidden' value='"+parentIndex+"'/>");
			var treeTxt=noleaf.children('treeTxt');
			noleafHtml.append("<ul class='"+treeTxt.attr("className")+"'></ul>");
			var treeTxtHtml=noleafHtml.children(".treeTxt");
		}else{
			var parentId="level_"+(level-1)+"_index_"+parentIndex; 
			$("#"+parentId).children("ul").append("<li id='"+id+"'class='"+noleaf.attr("className")+"'></li>");
			var noleafHtml=$("#"+id);
			var treeTitle=noleaf.children('treeTitle');
			noleafHtml.append("<span class='"+treeTitle.attr("className")+"'>"+treeTitle.text()+"</span>");
			noleafHtml.append("<input type='hidden' value='"+parentIndex+"'/>");
			var treeTxt=noleaf.children('treeTxt');
			noleafHtml.append("<ul class='"+treeTxt.attr("className")+"'></ul>");
			var treeTxtHtml=noleafHtml.children(".treeTxt");
		}
		printLeafForMenuMgr(treeTxtHtml,treeTxt);
	});
	printLeafForMenuMgr(treeParentHtml,treeParent);
}
function printLeafForMenuMgr(treeParentHtml,treeParent){
	treeParent.children("leaf").each(function(i){
		treeParentHtml.append("<li class='"+ $(this).attr("className")+"'>"+$(this).text()+"</li>");
		var leafHtml=treeParentHtml.children('.leaf').eq(i);
		var topage=$(this).attr("toPage");
		if(topage==undefined){
			topage="";
		}
		leafHtml.append("<input type='hidden' value='"+topage+"'/>");
	});	
}

