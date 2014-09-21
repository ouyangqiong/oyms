package com.ouyang.musicbar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ouyang.musicbar.dao.SongDao;
import com.ouyang.musicbar.dao.SongTypeDao;
import com.ouyang.musicbar.domain.Song;
import com.ouyang.musicbar.domain.SongType;
import com.ouyang.musicbar.service.ISongService;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-18
 */
public class SongServiceImpl implements ISongService {
	private static final Logger log=Logger.getLogger(SongServiceImpl.class);
	private SongTypeDao songTypeDao;
	private SongDao songDao;
	
	public SongDao getSongDao() {
		return songDao;
	}
	public void setSongDao(SongDao songDao) {
		this.songDao = songDao;
	}
	public SongTypeDao getSongTypeDao() {
		return songTypeDao;
	}
	public void setSongTypeDao(SongTypeDao songTypeDao) {
		this.songTypeDao = songTypeDao;
	}
	@Override
	public List<SongType> getFirstFiveSongType() {
		return songTypeDao.getSongTypes(0, 6);
	}

	@Override
	public ArrayList<Song> getSongListBySongTypeId(String songTypeId) {
		String attr="songTypeId";
		return (ArrayList<Song>) songDao.getSongList(attr,songTypeId);
	}
	@Override
	public Song getSong(String songId) {
		return songDao.getSong(songId);
	}
	@Override
	public ArrayList<Song> getSongDownloads(int download) {
		String orderby="download";
		return (ArrayList<Song>) songDao.getDescSong(orderby,download);
	}
	@Override
	public ArrayList<Song> getSongHits(int hit) {
		String orderby="hits";
		return (ArrayList<Song>) songDao.getDescSong(orderby,hit);
	}
	
	
	
	
}
