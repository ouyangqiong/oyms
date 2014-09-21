<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../js/jquery-1.7.2.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="../css/oyms.css" />
<link rel="stylesheet" type="text/css" href="../css/musicbar/musicbar.css" />
</head>
<body>
	<span id="lrcContent" style="display:none;">${lrcContent}</span>
  	<table width="100%" border="0" cellspacing="0" cellpadding="0">
   		 <tr>
     	 	<td height="30" background="../images/musicbar/newWindow_title.gif" style="font-size:16px">&nbsp;试听歌曲：${song.songName}</td>
   		 </tr>
 	 </table>
	<object classid="clsid:6BF52A52-394A-11D3-B153-00C04F79FAA6" id="mediaPlayer" width="480" height="64">
		<param name="url" value="${song.fileURL}" />
		<param name="volume" value="100" />
		<param name="playcount" value="100" />
		<param name="enableerrordialogs" value="0" />
		<param name="autostart" value="1" />
</object>
<div id="lrcAreaDiv" style="overflow:hidden;">
	<table id="lrcArea">
	<tr>
		<td style="text-align:center;">
			<table style="width:98%;">
				<tr>
					<td><span id="lrcLine1" style="height:20px;color:#FF0000">正在加载歌词...</span></td>
				</tr>
				<tr>
					<td  style="position:relative; top: -20px; z-index:6;"><div id="lrcLine_will1" class="lrcLine_will"></div></td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<table>
				<tr>
					<td><span id="lrcLine1" style="height:20px;color:#FF0000">正在加载歌词...</span></td>
				</tr>
				<tr>
					<td style="position:relative; top: -20px; z-index:6;"><div id="lrcLine_will1" class="lrcLine_will"></div></td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
    </div>
    <script type="text/javascript">
    </script>
</body>
</html>