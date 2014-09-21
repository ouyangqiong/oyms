/**
 * 
 */
package com.ouyang.musicbar.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ouyang.common.dao.BaseDao;
import com.ouyang.musicbar.domain.SongType;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-17
 */
public class SongTypeDao extends BaseDao{

	private static final Logger log=Logger.getLogger(SongTypeDao.class);
	/**
	 * @Description(查询SongType表从  startIndex 开始 后面的 maxSize条记录)
	 * @param startIndex
	 * @param maxSize
	 * @return
	 */
	public List<SongType> getSongTypes(int startIndex,int maxSize){
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		try{
		session.beginTransaction();
		Query query=session.createQuery("from SongType").setFirstResult(startIndex).setMaxResults(maxSize);
		List<SongType> sontTypes=query.list();
		session.getTransaction().commit();
		return sontTypes;
		}catch(Exception ex){
			session.getTransaction().rollback();
			log.info("getSongTypes",ex);
		}finally{
			session.close();
		}
		return null;
	}
}
