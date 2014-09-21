package com.ouyang.common.util;

import java.util.ResourceBundle;


public class PropertyUtil {
	private static ResourceBundle bundle=null;
	public PropertyUtil(){}
	 
	public static String getProp(String key){
		if(bundle==null){
			loadconf();
		}
		return bundle.getString(key);
	}
	private static void loadconf(){
		bundle=ResourceBundle.getBundle("common");
	}
}
