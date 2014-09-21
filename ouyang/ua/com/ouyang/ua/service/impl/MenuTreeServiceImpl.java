package com.ouyang.ua.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import com.ouyang.common.handler.XmlHandler;
import com.ouyang.common.util.PropertyUtil;
import com.ouyang.ua.domain.MenuTree;
import com.ouyang.ua.service.IMenuTreeService;

public class MenuTreeServiceImpl implements IMenuTreeService{
	private static final Logger log=Logger.getLogger(MenuTreeServiceImpl.class);
	public Document getMenuTreeDocument(){
		String appPath=MenuTreeServiceImpl.class.getClassLoader().getResource("").getPath();	
		File file=new File(appPath+PropertyUtil.getProp("treeCfgPath"));
		FileInputStream in=null;
		try {
			in = new FileInputStream(file);
			SAXReader reader=new SAXReader();
			Document doc=reader.read(in);
			return doc;
		} catch (FileNotFoundException e1) {
			log.info("找不到文件:"+file,e1);
		}
		catch (DocumentException e) {
			log.info("读取xml异常",e);
		}finally{
			
			if(in!=null){
				try {
					in.close();
					in=null;
				} catch (IOException e) {
					log.info("关闭流失败",e);
				}
			}
		}
		return null;
	}
	
	public boolean updateTreeMenu(MenuTree menuTree){
		String appPath=XmlHandler.class.getClassLoader().getResource("").getPath();	
		File file=new File(appPath+PropertyUtil.getProp("treeCfgPath"));
		FileInputStream in=null;
		try {
			in = new FileInputStream(file);
			SAXReader reader=new SAXReader();
			Document doc=reader.read(in);
		} catch (FileNotFoundException e1) {
			log.info("找不到文件:"+file,e1);
		}
		catch (DocumentException e) {
			log.info("读取xml异常",e);
		}finally{
			if(in!=null){
				try {
					in.close();
					in=null;
				} catch (IOException e) {
					log.info("关闭流失败",e);
				}
			}
		}
		return true;
	}
}
