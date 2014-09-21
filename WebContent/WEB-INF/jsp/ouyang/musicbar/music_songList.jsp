<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<table  style="width:364px;;height:60px;overflow:hidden;text-align:center;">
    <caption><span style="font-weight:bold; color:#DD6400;text-align:left;float:left;">${key}</span><a style="color:#FA6E00;float:right;" href="#">更多&gt;&gt;</a></caption>
  	<tr>
  		<td>
  			<form action="" target="_blank">
  			<table  width="98%" style="overflow:hidden;">
  				<tr><td height="24" bgcolor="#E7EAE2" width="5%;">选择</td>
					<td bgcolor="#E7EAE2" width="50%;">歌曲名称</td>
					<td bgcolor="#E7EAE2" width="40%">演唱者</td>
					<td bgcolor="#E7EAE2" width="5%;">试听</td>
				</tr>
				 <s:iterator value="#entry.value">
				<tr>
					<td>
						<input type="checkbox"  name="playId" value="<s:property value="id"/>" />
					</td>
				<td height="27"><s:property value="songName"/></td>
				<td><s:property value="singerName"/></td>
				<td colspan="2">
					<a href="#">
						<img src="../images/musicbar/tryListen.gif" width="16" height="16" onclick="tryListen('<s:property value="id"/>')">
					</a>
				</td>
			</tr>
			 </s:iterator>	
		</table>
  		<table style="width:100%;text-align:right;">
  			<tr>
  				<td class="rtd" style="color:#505050;">
  					<input name="ctrCheckbox" type="checkbox" onclick="checkAll(this.form.playId,this.form.ctrCheckbox)"/>
  					[<span class="word_green">全选/反选</span>]
  					[<a style="color:#FA6E00;cursor:hand;">歌曲连播</a>]
  					<div id="ch" style="display:none"> 
						<input name="playId" type="checkbox"  value="0"> 
						<!--层ch用于放置隐藏的checkbox控件，因为当表单中只是一个checkbox控件时，应用javascript获得其length属性值为undefine-->
	  				</div>
  				</td>
  			</tr>
  		</table>
  			</form>
  		</td>
  	</tr>
</table>