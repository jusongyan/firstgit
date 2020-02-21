package com.ect.nrac.cmc.sms;

import com.ect.bpc.sms.cnst.SmsCnst;

/**
 * 简单测试类
 * 
 * 测试前请向短信平台申请账号，并更改SmsCnst中的常量信息。
 * 
 * SIT测试结果查看url：http://60.191.100.234:5008/emp。
 * 账号/密码：admin/zt@mw。
 * 菜单：查询统计/数据查询/系统下行记录。
 * 
 * @author wucg
 * @since 2018-3-8
 */
public class TestSms {
	public static void main(String[] args) {
		SmsClient client = SmsClientFactory.getInstance(SmsCnst.SMS_SERVER_ENDPOINT);
		SmsMessage message = new SmsMessage();
		message.setUserid(SmsCnst.USER_ID);
		message.setPassword(SmsCnst.PASSWORD);
		message.setBiztype(SmsCnst.BIZ_TYPE);
		message.setTemplateId(SmsCnst.TEMPLATE);
		message.setPhone("13585962853");
		message.setMsgContent("2018-03-02 08:42|23230230920392323");
		System.out.println(client.send(message));
	}
}
