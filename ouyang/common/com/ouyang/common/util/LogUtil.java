package com.ouyang.common.util;

import org.apache.log4j.Logger;

/**
 * @ClassName LogUtil
 * @Description TODO(日志类输出工具类)
 * @author 欧阳琼
 * @date 2013-11-26 下午04:31:19
 */
public class LogUtil {
	private static Logger log = Logger.getLogger(LogUtil.class);
	
	public static void debug(String msg){
		log.debug(msg);
	}
	public static void debug(String msg,Throwable t){
		log.debug(msg,t);
	}
	
	public static void info(String msg){
		log.info(msg);
	}
	public static void info(String msg,Throwable t){
		log.info(msg,t);
	}
	
	public static void warn(String msg){
		log.warn(msg);
	}
	public static void warn(String msg,Throwable t){
		log.warn(msg,t);
	}
	
	public static void error(String msg){
		log.error(msg);
	}
	public static void error(String msg,Throwable t){
		log.error(msg,t);
	}
}
