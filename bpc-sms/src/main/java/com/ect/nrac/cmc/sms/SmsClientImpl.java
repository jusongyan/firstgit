package com.ect.nrac.cmc.sms;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ect.bpc.sms.cnst.SmsCnst;
import com.ect.nrac.cmc.sms.esb.ESBServerPortType;
import com.ect.nrac.cmc.sms.esb.SendMessageBodyType;
import com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType;
import com.ect.nrac.cmc.util.Logger;


/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public class SmsClientImpl implements SmsClient {
	private static Logger log = Logger.getLogger(SmsClientImpl.class);
	
    private ESBServerPortType smsServiceClient;
    
    public String systemName;
    public String smsSystemName;
    public String channelCode;
    
    public SmsClientImpl() {
    	
    }
    
    public SmsClientImpl(ESBServerPortType smsServiceClient) {
    	this.smsServiceClient = smsServiceClient;
    }
    
    public ESBServerPortType getSmsServiceClient() {
		return smsServiceClient;
	}

	public void setSmsServiceClient(ESBServerPortType smsServiceClient) {
		this.smsServiceClient = smsServiceClient;
	}

	/**
     * 生成调用短信平台接口请求报文头
     */
    private SendMessageBodyType.SHEAD getRequestHead() {
        SendMessageBodyType.SHEAD shead = new SendMessageBodyType.SHEAD();
        shead.setHeadVersion(SmsCnst.SMS_HEAD_VERSION);//报文头编号，都填1
        shead.setVersion(SmsCnst.SMS_SERVICE_VERSION);//版本号，都填1.01
        shead.setRequestId(this.systemName);//请求系统，填请求方系统英文简写
        shead.setTargetId(this.smsSystemName);//服务系统，填写服务提供方系统简写
        shead.setChannelId(this.channelCode);//渠道号，参考技术规范文档
        shead.setChannelSerialNo(IdGenerator.channelId());//渠道流水号，26位，规则参考技术规范文档
        shead.setSysSerialNo(IdGenerator.systemId());//系统流水号，24位，参考技术规范文档填写
        Date date = new Date();
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm");//24小时制
        shead.setRequestTime(sdformat.format(date));// 请求消息发送前一刻的时间点。格式为yyyy-MM-dd HH:mm:ss.mmm,24小时制精确到毫秒
        return shead;
    }
    /**
     * 生成调用短信平台接口请求报文体
     */
    private SendMessageBodyType.SBODY getRequestBody(SmsMessage message) {
        SendMessageBodyType.SBODY sbody = new SendMessageBodyType.SBODY();
        sbody.setUserId(message.getUserid());
        sbody.setPassword(message.getPassword());
        sbody.setMobPhoNo(message.getPhone());
        sbody.setMsgContent(message.getMsgContent());
        sbody.setPszSubPort("*");
        sbody.setBizType(message.getBiztype());
        sbody.setExtraData(message.getTemplateId());
        sbody.setShortMsgId(IdGenerator.channelId());
        sbody.setUrgent(SmsCnst.SEND_LEVEL);
        return sbody;
    }
    /**
     * 短信发送
     */
    @Override
    public String send(SmsMessage message) {
    	/**
         *Step1.组装调用短信平台接口的报文头和报文体
         */
        SendMessageBodyType.SHEAD shead = this.getRequestHead();
        SendMessageBodyType.SBODY sbody = this.getRequestBody(message);
        javax.xml.ws.Holder<SendMessageResponseBodyType.SHEAD> retshead = new javax.xml.ws.Holder<SendMessageResponseBodyType.SHEAD>();
        javax.xml.ws.Holder<SendMessageResponseBodyType.SBODY> retsbody = new javax.xml.ws.Holder<SendMessageResponseBodyType.SBODY>();
        /**
         *Step2.调用短信平台接口（不带模板发送），发送短信
         */
        try {
            smsServiceClient.sendMessage(shead, sbody, retshead, retsbody);
            System.out.println(retshead);
            System.out.println(retsbody);
        } catch (Exception e) {
        	log.error("发送短信失败："+message, e);
            return SmsCnst.CNT_STATUS_3;
        }
        /**
         *Step3.返回结果处理
         */
        if (null == retshead.value) {
        	log.error("发送短信失败："+message+",ESB返回：状态="+retshead.value+"，描述="+retsbody.value.getExt1());
        	return SmsCnst.CNT_STATUS_2;
        }
        String retType = retshead.value.getRetType();
        if(null != retType && SmsCnst.ESB_SUCCESS.equals(retType)){
        	log.info("发送短信成功："+message+",ESB返回：状态="+retshead.value+"，描述="+retsbody.value.getExt1());
        	return SmsCnst.CNT_STATUS_1;
        }
        
        log.error("发送短信失败："+message+",ESB返回：状态="+retshead.value+"，描述="+retsbody.value.getExt1());
        return SmsCnst.CNT_STATUS_2;
    }
}
