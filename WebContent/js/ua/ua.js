function updateLeaf(){
	var type="leaf";
	var nameStr=$("#leafValueId").val();
	var oldNameStr=$("#oldNameStr").val();
	var eventStr=$("#leafToPageId").val();
	$.ajax({
		type:'POST',
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		url:'treeConfig!updateTree.action',
		data:{"oldNameStr":oldNameStr,"nameStr":nameStr,"eventStr":eventStr,"type":type},
		dataType:'json',
		async: false,
		success:function(data){
			
		},
		complete:function(XHR,TS){
			XHR=null;
		}
	});
}
function updateNoleaf(){
	var type="noleaf";
	var nameStr=$("#noleafValueId").val();
	var oldNameStr=$("#oldNameStr").val();
	$.ajax({
		type:'POST',
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		url:'treeConfig!updateTree.action',
		data:{"oldNameStr":oldNameStr,"nameStr":nameStr,"type":type},
		async: false,
		dataType:'json',
		success:function(data){
			
		},
		complete:function(XHR,TS){
			XHR=null;
		}
	});
}
