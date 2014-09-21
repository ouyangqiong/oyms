package com.ouyang.common.interceptor;

import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.ouyang.common.util.PropertyUtil;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-16
 */
public class OymsInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 8966275700881814990L;
	private static final Logger log=Logger.getLogger(OymsInterceptor.class);
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context=invocation.getInvocationContext();
		ActionProxy proxy=invocation.getProxy();
		String namespace=proxy.getNamespace();
		String actionName=proxy.getActionName();
		String methodName=proxy.getMethod();
		Map session=context.getSession();
		int size=session.size();
		if(size==0&&!isFilterPath(methodName)){
			log.debug("requeset Path : " + namespace + "/" + actionName + "!" + methodName + ".action");
			return "timeoutpage";
		}
		return invocation.invoke();
	}
	//方法是否过滤
	public boolean isFilterPath(String methodName){
		String timeoutMethod=PropertyUtil.getProp("filterMethod");
		return timeoutMethod.contains(methodName+",");
			
	}

}
