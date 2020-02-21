package com.ect.nrac.cmc.sms.esb;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "sendMessageResponseBodyType", propOrder = {
    "shead",
    "sbody"
})
public class SendMessageResponseBodyType {

    @XmlElement(name = "SHEAD", required = true)
    protected SendMessageResponseBodyType.SHEAD shead;
    @XmlElement(name = "SBODY", required = true)
    protected SendMessageResponseBodyType.SBODY sbody;

    /**
     * ��ȡshead���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendMessageResponseBodyType.SHEAD }
     *     
     */
    public SendMessageResponseBodyType.SHEAD getSHEAD() {
        return shead;
    }

    /**
     * ����shead���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageResponseBodyType.SHEAD }
     *     
     */
    public void setSHEAD(SendMessageResponseBodyType.SHEAD value) {
        this.shead = value;
    }

    /**
     * ��ȡsbody���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendMessageResponseBodyType.SBODY }
     *     
     */
    public SendMessageResponseBodyType.SBODY getSBODY() {
        return sbody;
    }

    /**
     * ����sbody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageResponseBodyType.SBODY }
     *     
     */
    public void setSBODY(SendMessageResponseBodyType.SBODY value) {
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
     *         &lt;element ref="{http://www.ect888.com/metadata}MsgId"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}ext1" minOccurs="0"/>
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
        "msgId",
        "ext1"
    })
    public static class SBODY {

        @XmlElement(name = "MsgId", namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String msgId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", nillable = true)
        protected String ext1;

        /**
         * ��ȡmsgId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgId() {
            return msgId;
        }

        /**
         * ����msgId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgId(String value) {
            this.msgId = value;
        }

        /**
         * ��ȡext1���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExt1() {
            return ext1;
        }

        /**
         * ����ext1���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExt1(String value) {
            this.ext1 = value;
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
     *         &lt;element ref="{http://www.ect888.com/metadata}channelSerialNo"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}sysSerialNo"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}responseId"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}routeInfo"/>
     *         &lt;element ref="{http://www.ect888.com/metadata}retType"/>
     *         &lt;element name="ret" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.ect888.com/metadata}retCode"/>
     *                   &lt;element ref="{http://www.ect888.com/metadata}retMessage" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "channelSerialNo",
        "sysSerialNo",
        "responseId",
        "routeInfo",
        "retType",
        "ret"
    })
    public static class SHEAD {

        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String channelSerialNo;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String sysSerialNo;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String responseId;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String routeInfo;
        @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
        protected String retType;
        protected List<SendMessageResponseBodyType.SHEAD.Ret> ret;

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
         * ��ȡresponseId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseId() {
            return responseId;
        }

        /**
         * ����responseId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseId(String value) {
            this.responseId = value;
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

        /**
         * ��ȡretType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRetType() {
            return retType;
        }

        /**
         * ����retType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRetType(String value) {
            this.retType = value;
        }

        /**
         * Gets the value of the ret property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ret property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SendMessageResponseBodyType.SHEAD.Ret }
         * 
         * 
         */
        public List<SendMessageResponseBodyType.SHEAD.Ret> getRet() {
            if (ret == null) {
                ret = new ArrayList<SendMessageResponseBodyType.SHEAD.Ret>();
            }
            return this.ret;
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
         *         &lt;element ref="{http://www.ect888.com/metadata}retCode"/>
         *         &lt;element ref="{http://www.ect888.com/metadata}retMessage" minOccurs="0"/>
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
            "retCode",
            "retMessage"
        })
        public static class Ret {

            @XmlElement(namespace = "http://www.ect888.com/metadata", required = true, nillable = true)
            protected String retCode;
            @XmlElement(namespace = "http://www.ect888.com/metadata", nillable = true)
            protected String retMessage;

            /**
             * ��ȡretCode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetCode() {
                return retCode;
            }

            /**
             * ����retCode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetCode(String value) {
                this.retCode = value;
            }

            /**
             * ��ȡretMessage���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetMessage() {
                return retMessage;
            }

            /**
             * ����retMessage���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetMessage(String value) {
                this.retMessage = value;
            }

        }

    }

}
