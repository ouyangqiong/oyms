<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<table width="220" height="60" style="padding: 4px;">
	<tr>
		<td>
		<form action="">
		<table width="100%">
			<tr bgcolor="#E7EAE2">
				<td height="24">&nbsp;</td>
				<td class="word_gray">&nbsp;歌曲名</td>
				<td class="word_gray">演唱者</td>
				<td class="word_gray">次数</td>
			</tr>
		<s:iterator value="#request.sortType" id="entry">
			<tr>
				<td align="center"><input type="checkbox"  name="playId" value="${id}" />
				</td>
				<td height="27" title="aaa">${songNameShort}</td>
				<td title="bbb">${singerName}</td>
				<td>
					<s:if test="#request.sortTypeName=='hits'">
						${hits}
					</s:if>
					<s:else>
						${download}
					</s:else>
				</td>
			</tr>
		</s:iterator>
		</table>
		<table style="width:100%;text-align:right;">
  			<tr>
  				<td class="rtd" style="padding-left:10px;padding-right:5px;color:#505050;">
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