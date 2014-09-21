/**
 * 
 */
package com.ouyang.musicbar.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ouyang.common.dao.BaseDao;
import com.ouyang.musicbar.domain.Song;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-18
 */
public class SongDao extends BaseDao{

	private static final Logger log=Logger.getLogger(SongDao.class);
	/**
	 * @param attr
	 * @param songTypeId
	 */
	public List<Song> getSongList(String attr, String songTypeId) {
		List list=null;
		try{
			StringBuilder hql=new StringBuilder();
			hql.append(" from Song so where so."+attr+"=?");
			list=this.getHibernateTemplate().find(hql.toString(), songTypeId);
		}catch(Exception ex){
			log.info("getSongList",ex);
		}
		return list;
	}
	/**
	 * @param songId
	 */
	public Song getSong(String songId) {
		Song song=null;
		try{
			song=(Song) this.getHibernateTemplate().get(Song.class, songId);
		}catch(Exception ex){
			log.info("getSong",ex);
		}
		return song;
	}
	/**
	 * @param orderby
	 * @param num
	 */
	public List<Song> getDescSong(String orderby, int num) {
		StringBuilder buf=new StringBuilder();
		buf.append("from Song  order by "+orderby+" desc");
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		try{
		session.beginTransaction();
		Query query=session.createQuery(buf.toString()).setFirstResult(0).setMaxResults(num);
		List<Song> songs= query.list();
		session.getTransaction().commit();
		return songs;
		}catch(Exception ex){
			session.getTransaction().rollback();
			log.info("getDescSong",ex);
		}finally{
			session.close();
		}
		return null;
	}
	

}
