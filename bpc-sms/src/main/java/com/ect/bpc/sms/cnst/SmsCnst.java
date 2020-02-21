package com.ect.bpc.sms.cnst;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public interface SmsCnst {
	/** 应用头本身的版本号，随头部格式变化而递增。为1~9的数字，从1开始。 */
    String SMS_HEAD_VERSION = "1";

    /** 请求方请求的服务版本号。版本号结构为：X.Y */
    String SMS_SERVICE_VERSION = "1.01";
    /**
     * 短信服务器地址，详见：http://wiki.ect888.com:8090/pages/viewpage.action?pageId=8028564
     */
    String SMS_SERVER_ENDPOINT = "http://11.16.0.3:10100/sms";
    /**
     * 系统简称---见证通标准
     */
    String SYSTEM_NAME = "SLRM";
    /**
     * 系统编号---见证通标准
     */
    String SYSTEM_CODE = "4034";
    /**
     * 系统节点编号---自己分配，建议不同部署节点才有不同的编号
     */
    String SYSTEM_NODE_ID = "00";
    /**
     * 短信服务系统
     */
    String SMS_SYSTME_NAME = "SMS";
    /**
     * 渠道编号
     */
    String CHANNEL_CODE = "27";
    /**
     * 用户名 ---向短信平台申请
     */
    String USER_ID = "SLRM01";
    /**
     * 密码 ---向短信平台申请
     */
    String PASSWORD = "SLRM4034";
    /**
     * 短信业务分类 ---向短信平台申请
     */
    String BIZ_TYPE = "40340007";
    /**
     * 短信模板 ---向短信平台申请
     * 
     * 模板内容为：时间：{#参数1#}，交易编号{#参数2#}触发风控规则，请登录系统处理。
     */
    String TEMPLATE = "SLRM0001";
    /** 默认 发送级别 */
    String SEND_LEVEL = "6";
    /**
     * ESB成功
     */
    String ESB_SUCCESS = "Y";
    /**
	 * 发送状态：0--待发送
	 */
	String CNT_STATUS_0 = "0";
	/**
	 * 发送状态：1--发送成功
	 */
	String CNT_STATUS_1 = "1";
	/**
	 * 发送状态：2--发送失败
	 */
	String CNT_STATUS_2 = "2";
	/**
	 * 发送状态：3--发送超时
	 */
	String CNT_STATUS_3 = "3";
}
