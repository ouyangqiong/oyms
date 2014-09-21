package com.ouyang.ua.dao;
import java.util.List;

import org.apache.log4j.Logger;

import com.ouyang.common.dao.BaseDao;
import com.ouyang.ua.domain.Menu;

/**
 * @author 欧阳琼
 * 2013-7-7
 */
public class MenuDao extends BaseDao{
	private static final Logger log=Logger.getLogger(MenuDao.class);
	public List<Menu> getAllMenuInfo(){
		List<Menu> list=this.getHibernateTemplate().find("from Menu");
		if(list==null || list.size()==0){
			log.info("获取菜单表所有数据失败");
		}
		return list;	
	}
	public List<Menu> getMenuListByParentId(String parentId){
		List<Menu> list=this.getHibernateTemplate().find("from Menu menu where menu.parentId=? order by menu_layer_mark",new String[]{parentId});
		if(list==null || list.size()==0){
			log.info("获取菜单表所有数据失败");
		}
		return list;	
	}
}
