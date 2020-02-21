package com.ect.bpc.sms.service;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ect.bpc.sms.main.BpcSmsMain;
import com.ect.nrac.cmc.sms.SmsClientFactory;
import com.ect.nrac.cmc.sms.SmsClientImpl;
import com.ect.nrac.cmc.sms.SmsMessage;
import com.ect.nrac.cmc.util.Logger;

@RequestMapping("/bpc")
@Controller
public class BpcSmsService {
	static final Logger LOG = Logger.getLogger(BpcSmsMain.class);
	static final String SUCCESS = "0";
	static final String FAIL = "1";

	@Value("${sms.template}")
	private String template;

	@Value("${sms.bizType}")
	private String bizType;

	@Value("${sms.password}")
	private String password;

	@Value("${sms.userId}")
	private String userId;

	@Value("${sms.channelCode}")
	private String channelCode;

	@Value("${sms.smsSystemName}")
	private String smsSystemName;

	@Value("${sms.nodeId}")
	private String nodeId;

	@Value("${sms.systemCode}")
	private String systemCode;

	@Value("${sms.systemName}")
	private String systemName;

	@Value("${sms.smsEndpoint}")
	private String smsEndpoint;

	private SmsClientImpl client;

	@PostConstruct
	public void init() {
		client = SmsClientFactory.getInstance(this.smsEndpoint);
		client.channelCode = this.channelCode;
		client.systemName = this.systemName;
		client.smsSystemName = this.smsSystemName;
		LOG.info("对象初始化成功。");
	}

	/**
	 * 短信发送接口
	 * 
	 * @param param
	 *            = {name=?,phone=?,content=?}
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value = "/sendSms", method = RequestMethod.POST)
	public String service(@RequestParam("param") String param) {
		try {
			LOG.info("param=" + param);
			Map<String, Object> data = null;
			try {
				data = JSON.parseObject(param, Map.class);
			} catch (Exception e) {
				LOG.error("参数解析报错，param=" + param, e);
				return FAIL;
			}

			try {
				SmsMessage message = new SmsMessage();
				message.setUserid(this.userId);
				message.setPassword(this.password);
				message.setBiztype(this.bizType);
				message.setTemplateId(this.template);
				message.setPhone(data.get("phone").toString());
				//message.setMsgContent(data.get("name") + "|" + data.get("content"));
				message.setMsgContent(data.get("content")+"");
				System.out.println(client.send(message));
			} catch (Exception e) {
				LOG.error("短信发送报错，param=" + param, e);
				return FAIL;
			}
		} catch (Throwable e) {
			LOG.error("短信发送报错，param=" + param, e);
			return FAIL;
		}

		return SUCCESS;
	}

}
