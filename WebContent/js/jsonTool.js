(function($){
	$.fn.serializeJson=function(){
		 var serializeObj={};
		 var array=this.serializeArray();
		 var str=this.serialize();
		 $(array).each(function(){
			 if(serializeObj[this.name]){
				 if($.isArray(serializeObj[this.name])){
					 serializeObj[this.name].push(this.value);
				 }else{
					 serializeObj[this.name]=[serializeObj[this.name],this.value];
				 }
			 }else{
				 serializeObj[this.name]=this.value;
			 }
		 });
		 return serializeObj;
	 };
	  //serialize()//会进行编码encodeURIComponenet()
	 $.fn.simpleSerialize=function(){
		 var str=this.serialize();
		 str=str.replace(/=/g,"':'");
		 str=str.replace(/&/g,"','");
		 str ="({'"+str+"'})";
		 str=decodeURIComponent(str,true);
		 obj=eval(str);
		 return obj;
	 };
})(jQuery);
