package com.ect.nrac.cmc.util;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author wucg
 * @since 2018-3-7
 * 
 */
public class Logger {
	static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(Logger.class);
	
	static Map<Object,Logger> repostory = new HashMap<Object,Logger>();
	
	private org.apache.log4j.Logger logger;
	
	public void info(Object message) {
		try {
			this.logger.info(message);
		} catch (Throwable e) {
			try {
				LOG.error("记录日志异常，请检查系统环境是否正确。", e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void info(Object message,Throwable t) {
		try {
			this.logger.info(message,t);
		} catch (Throwable e) {
			try {
				LOG.error("记录日志异常，请检查系统环境是否正确。", e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void error(Object message) {
		try {
			this.logger.error(message);
		} catch (Throwable e) {
			try {
				LOG.error("记录日志异常，请检查系统环境是否正确。", e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void error(Object message,Throwable t) {
		try {
			this.logger.error(message,t);
		} catch (Throwable e) {
			try {
				LOG.error("记录日志异常，请检查系统环境是否正确。", e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void debug(Object message) {
		try {
			this.logger.debug(message);
		} catch (Throwable e) {
			try {
				LOG.error("记录日志异常，请检查系统环境是否正确。", e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void debug(Object message,Throwable t) {
		try {
			this.logger.debug(message,t);
		} catch (Throwable e) {
			try {
				LOG.error("记录日志异常，请检查系统环境是否正确。", e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static Logger getLogger(Class clz){
		if(!repostory.containsKey(clz)) {
			synchronized(repostory) {
				if(!repostory.containsKey(clz)) {
					Logger log = new Logger();
					log.logger = org.apache.log4j.Logger.getLogger(clz);
					repostory.put(clz,log);
				}
			}
		}
		
		return repostory.get(clz);
	}
}
