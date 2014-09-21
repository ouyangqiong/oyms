/**
 * 
 */
package com.ouyang.musicbar.service;

import java.util.ArrayList;
import java.util.List;

import com.ouyang.musicbar.domain.Song;
import com.ouyang.musicbar.domain.SongType;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-18
 */
public interface ISongService {

	public List<SongType> getFirstFiveSongType();

	/**
	 * @param id
	 */
	public ArrayList<Song>  getSongListBySongTypeId(String songTypeId);

	/**
	 * @param songId
	 * @return
	 */
	public Song getSong(String songId);

	/**
	 * @Description 获取点击排行前面hit个
	 * @param hit
	 * @return
	 */
	public ArrayList<Song> getSongHits(int hit);

	/**
	 * @Description 获取下载排行前面download个
	 * @param download
	 * @return
	 */
	public  ArrayList<Song> getSongDownloads(int download);
}
