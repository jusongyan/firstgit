package com.ect.nrac.cmc.sms;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public interface SmsClient {
   /**
    * 本方法执行所需时间约为100毫秒
    * 
    * @param message
    * @return 
    */
    public String send(SmsMessage message);
}
