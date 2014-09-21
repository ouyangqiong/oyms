package com.ouyang.musicbar.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ouyang.common.action.OymsAction;
import com.ouyang.musicbar.domain.Song;
import com.ouyang.musicbar.domain.SongType;
import com.ouyang.musicbar.service.ISongService;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-15
 */
public class SongAction extends OymsAction{

	private static final long serialVersionUID = -1088081019002653089L;
	private ISongService songService;
	private Song song;
	private String sortType;
	
	
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public ISongService getSongService() {
		return songService;
	}
	public void setSongService(ISongService songService) {
		this.songService = songService;
	}
	// 查询试听歌曲信息
	public String tryListen(){
		//获取歌曲名称和歌词url地址
		String songId=request.getParameter("songId");
		if(songId!=null && !"".equals(songId)){
			song=songService.getSong(songId);
			if(song!=null){
				/** **************获取歌词************************* */
				return "tryListen";
			}
		}
		return ERROR;
	}
	// 歌曲排行（试听和下载）
	public String songSort(){
		String type = sortType;	//获取表示是试听排行还是下载排行的参数值
		ArrayList<Song> songs=null;
		if ("hits".equals(type)) {
			songs= songService.getSongHits(3);
			request.setAttribute("sortType",songs);
			 // 获取试听排行信息
		} else if ("download".equals(type)) {
			songs= songService.getSongDownloads(3);
			request.setAttribute("sortType",songs);
			 // 获取下载排行信息
		}
		request.setAttribute("sortTypeName", sortType);
		return "songSort";
	}
	public String navigation(){
		return "navigation";
	}
	
	public String musicMain(){
		List<SongType> list=songService.getFirstFiveSongType();
		HashMap<String, ArrayList<Song>> songMap=new HashMap<String,ArrayList<Song>>();
		int len=list.size();
		for(int i=0;i<len;i++){
			SongType songType=list.get(i);
			ArrayList<Song> songList= songService.getSongListBySongTypeId(songType.getId());
			if(songList!=null && songList.size()>0){
				songMap.put(songType.getTypeName(), songList);
			}
		}
		request.setAttribute("songMap", songMap); // 保存类别信息数组到Request中
		return "musicbar";
		
	}

}
