package com.ect.nrac.cmc.sms;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public class SmsMessage {
	String userid;
	String password;
	String biztype;
    String templateId;//模板ID，uat测试用，ZTB007；必填
    String phone;//手机号，必填
    String msgContent;//依照模板，多参数之间用竖线分隔，必填


    public SmsMessage() {}

    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBiztype() {
		return biztype;
	}

	public void setBiztype(String biztype) {
		this.biztype = biztype;
	}

	public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String toString() {
        return "SmsMessage{" +
                	"templateId=" + templateId + 
                	", phone=" + phone +
                	", msgContent=" + msgContent + 
                '}';
    }
}
