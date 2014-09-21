package com.ouyang.musicbar.domain;

import java.util.Date;

import com.ouyang.common.domain.BaseBean;
import com.ouyang.musicbar.util.Consts;

/**
 * @Description TODO(歌曲)
 * @author 欧阳琼
 * 2013-9-15
 */
public class Song extends BaseBean{

	private String songName;//歌曲名称
	private String singerName;//演唱者
	private String specialName;//专辑名称
	private String fileSize;//文件大小
	private String fileURL;//文件路径
	private String format;//文件格式
	private int hits;//试听次数
	private int download;//下载次数
	private Date upTime;//上传时间
	private String playId;//播放歌曲的ID
	private String songTypeId;//歌曲类别ID
	private String songType;//歌曲类别
	private String songNameShort;//截取后的歌曲名
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getSpecialName() {
		return specialName;
	}
	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileURL() {
		return fileURL;
	}
	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}

	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public Date getUpTime() {
		return upTime;
	}
	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}
	public String getPlayId() {
		return playId;
	}
	public void setPlayId(String playId) {
		this.playId = playId;
	}
	public String getSongTypeId() {
		return songTypeId;
	}
	public void setSongTypeId(String songTypeId) {
		this.songTypeId = songTypeId;
	}
	public String getSongType() {
		return songType;
	}
	public void setSongType(String songType) {
		this.songType = songType;
	}
	public String getSongNameShort() {
		return songNameShort;
	}
	public void setSongNameShort(String songNameShort) {
		this.songNameShort = stringSubStr(songNameShort,Consts.SONG_LENGTH);
	}
	
	private String stringSubStr(String str,int len){
		if(str==null){
			return "";
		}else{
			byte[] temp;
			int reallen=0;
			//编码 不同 所以 先 获得 bytes后 截取 
			for(int i=0;i<str.length();i++){
				temp=(str.substring(i,i+1)).getBytes();
				reallen+=temp.length;
				if(reallen>len){
					str=str.substring(0,i);
					break;
				}
			}
		}
		return str;
	}
}
