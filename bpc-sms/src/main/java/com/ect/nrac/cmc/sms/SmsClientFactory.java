package com.ect.nrac.cmc.sms;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.ect.nrac.cmc.sms.esb.ESBServerPortType;
/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public class SmsClientFactory {
	private static Map<String,SmsClientImpl> cache = new HashMap<String,SmsClientImpl>();
	
	/**
	 * 短信发送为短链接，可以不用在会话断开后重新建立Client
	 * 
	 * @param endpoint http://11.16.0.3:10100/sms
	 * @return
	 */
	public static synchronized SmsClientImpl getInstance(String endpoint) {
		if(cache.get(endpoint) == null) {
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();   
		    factory.setServiceClass(ESBServerPortType.class);   
		    factory.setAddress(endpoint); 
		    ESBServerPortType port = (ESBServerPortType)factory.create();
		    SmsClientImpl client = new SmsClientImpl(port);
		    cache.put(endpoint,client);
		}
		
		return cache.get(endpoint);
	}
}
