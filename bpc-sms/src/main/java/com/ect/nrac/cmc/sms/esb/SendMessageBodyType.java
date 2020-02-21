package com.ect.nrac.cmc.sms.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessageBodyType", propOrder = {
    "shead",
    "sbody"
})
public class SendMessageBodyType {

    @XmlElement(name = "SHEAD", required = true)
    protected SendMessageBodyType.SHEAD shead;
    @XmlElement(name = "SBODY", required = true)
    protected SendMessageBodyType.SBODY sbody;

    /**
     * ��ȡshead���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendMessageBodyType.SHEAD }
     *     
     */
    public SendMessageBodyType.SHEAD getSHEAD() {
        return shead;
    }

    /**
     * ����shead���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageBodyType.SHEAD }
     *     
     */
    public void setSHEAD(SendMessageBodyType.SHEAD value) {
        this.shead = value;
    }

    /**
     * ��ȡsbody���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendMessageBodyType.SBODY }
     *     
     */
    public SendMessageBodyType.SBODY getSBODY() {
        return sbody;
    }

    /**
     * ����sbody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageBodyType.SBODY }
     *     
     */
    public void setSBODY(SendMessageBodyType.SBODY value) {
        this.sbody = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ect888.com/metadata}userId"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}password"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}mobPhoNo"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}msgContent"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}pszSubPort"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}bizType"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}extraData"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}urgent"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}Param3"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}Param4"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}shortMsgId"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}attime" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userId",
        "password",
        "mobPhoNo",
        "msgContent",
        "pszSubPort",
        "bizType",
        "extraData",
        "urgent",
        "param3",
        "param4",
        "shortMsgId",
        "attime"
    })
    public static class SBODY {

        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String userId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String password;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String mobPhoNo;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String msgContent;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String pszSubPort;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String bizType;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String extraData;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String urgent;
        @XmlElement(name = "Param3", namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String param3;
        @XmlElement(name = "Param4", namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String param4;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String shortMsgId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", nillable = true)
        protected String attime;

        /**
         * ��ȡuserId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserId() {
            return userId;
        }

        /**
         * ����userId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserId(String value) {
            this.userId = value;
        }

        /**
         * ��ȡpassword���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * ����password���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * ��ȡmobPhoNo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobPhoNo() {
            return mobPhoNo;
        }

        /**
         * ����mobPhoNo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobPhoNo(String value) {
            this.mobPhoNo = value;
        }

        /**
         * ��ȡmsgContent���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgContent() {
            return msgContent;
        }

        /**
         * ����msgContent���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgContent(String value) {
            this.msgContent = value;
        }

        /**
         * ��ȡpszSubPort���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPszSubPort() {
            return pszSubPort;
        }

        /**
         * ����pszSubPort���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPszSubPort(String value) {
            this.pszSubPort = value;
        }

        /**
         * ��ȡbizType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBizType() {
            return bizType;
        }

        /**
         * ����bizType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBizType(String value) {
            this.bizType = value;
        }

        /**
         * ��ȡextraData���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtraData() {
            return extraData;
        }

        /**
         * ����extraData���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtraData(String value) {
            this.extraData = value;
        }

        /**
         * ��ȡurgent���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrgent() {
            return urgent;
        }

        /**
         * ����urgent���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrgent(String value) {
            this.urgent = value;
        }

        /**
         * ��ȡparam3���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParam3() {
            return param3;
        }

        /**
         * ����param3���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParam3(String value) {
            this.param3 = value;
        }

        /**
         * ��ȡparam4���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParam4() {
            return param4;
        }

        /**
         * ����param4���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParam4(String value) {
            this.param4 = value;
        }

        /**
         * ��ȡshortMsgId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortMsgId() {
            return shortMsgId;
        }

        /**
         * ����shortMsgId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortMsgId(String value) {
            this.shortMsgId = value;
        }

        /**
         * ��ȡattime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttime() {
            return attime;
        }

        /**
         * ����attime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttime(String value) {
            this.attime = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ect888.com/metadata}headVersion"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}version"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}channelSerialNo"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}sysSerialNo"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}requestId"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}targetId" minOccurs="0"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}requestTime"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}channelId"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}routeInfo" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "headVersion",
        "version",
        "channelSerialNo",
        "sysSerialNo",
        "requestId",
        "targetId",
        "requestTime",
        "channelId",
        "routeInfo"
    })
    public static class SHEAD {

        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String headVersion;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String version;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String channelSerialNo;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String sysSerialNo;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String requestId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", nillable = true)
        protected String targetId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String requestTime;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String channelId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", nillable = true)
        protected String routeInfo;

        /**
         * ��ȡheadVersion���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeadVersion() {
            return headVersion;
        }

        /**
         * ����headVersion���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeadVersion(String value) {
            this.headVersion = value;
        }

        /**
         * ��ȡversion���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * ����version���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * ��ȡchannelSerialNo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelSerialNo() {
            return channelSerialNo;
        }

        /**
         * ����channelSerialNo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelSerialNo(String value) {
            this.channelSerialNo = value;
        }

        /**
         * ��ȡsysSerialNo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSysSerialNo() {
            return sysSerialNo;
        }

        /**
         * ����sysSerialNo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSysSerialNo(String value) {
            this.sysSerialNo = value;
        }

        /**
         * ��ȡrequestId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestId() {
            return requestId;
        }

        /**
         * ����requestId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestId(String value) {
            this.requestId = value;
        }

        /**
         * ��ȡtargetId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetId() {
            return targetId;
        }

        /**
         * ����targetId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetId(String value) {
            this.targetId = value;
        }

        /**
         * ��ȡrequestTime���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestTime() {
            return requestTime;
        }

        /**
         * ����requestTime���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestTime(String value) {
            this.requestTime = value;
        }

        /**
         * ��ȡchannelId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelId() {
            return channelId;
        }

        /**
         * ����channelId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelId(String value) {
            this.channelId = value;
        }

        /**
         * ��ȡrouteInfo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteInfo() {
            return routeInfo;
        }

        /**
         * ����routeInfo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteInfo(String value) {
            this.routeInfo = value;
        }

    }

}
