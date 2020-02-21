package com.ect.nrac.cmc.sms.esb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MobPhoNo_QNAME = new QName("http://www.ect888.com/metadata", "mobPhoNo");
    private final static QName _ResponseId_QNAME = new QName("http://www.ect888.com/metadata", "responseId");
    private final static QName _ChannelSerialNo_QNAME = new QName("http://www.ect888.com/metadata", "channelSerialNo");
    private final static QName _Attime_QNAME = new QName("http://www.ect888.com/metadata", "attime");
    private final static QName _UserId_QNAME = new QName("http://www.ect888.com/metadata", "userId");
    private final static QName _Password_QNAME = new QName("http://www.ect888.com/metadata", "password");
    private final static QName _Version_QNAME = new QName("http://www.ect888.com/metadata", "version");
    private final static QName _RouteInfo_QNAME = new QName("http://www.ect888.com/metadata", "routeInfo");
    private final static QName _MsgId_QNAME = new QName("http://www.ect888.com/metadata", "MsgId");
    private final static QName _Ret_QNAME = new QName("http://www.ect888.com/metadata", "ret");
    private final static QName _SendMessage_QNAME = new QName("http://www.ect888.com/service/MessageService", "sendMessage");
    private final static QName _PszSubPort_QNAME = new QName("http://www.ect888.com/metadata", "pszSubPort");
    private final static QName _RequestTime_QNAME = new QName("http://www.ect888.com/metadata", "requestTime");
    private final static QName _BizType_QNAME = new QName("http://www.ect888.com/metadata", "bizType");
    private final static QName _MsgContent_QNAME = new QName("http://www.ect888.com/metadata", "msgContent");
    private final static QName _RetType_QNAME = new QName("http://www.ect888.com/metadata", "retType");
    private final static QName _RetMessage_QNAME = new QName("http://www.ect888.com/metadata", "retMessage");
    private final static QName _HeadVersion_QNAME = new QName("http://www.ect888.com/metadata", "headVersion");
    private final static QName _RetCode_QNAME = new QName("http://www.ect888.com/metadata", "retCode");
    private final static QName _Param3_QNAME = new QName("http://www.ect888.com/metadata", "Param3");
    private final static QName _Ext1_QNAME = new QName("http://www.ect888.com/metadata", "ext1");
    private final static QName _SysSerialNo_QNAME = new QName("http://www.ect888.com/metadata", "sysSerialNo");
    private final static QName _Param4_QNAME = new QName("http://www.ect888.com/metadata", "Param4");
    private final static QName _ExtraData_QNAME = new QName("http://www.ect888.com/metadata", "extraData");
    private final static QName _TargetId_QNAME = new QName("http://www.ect888.com/metadata", "targetId");
    private final static QName _SendMessageResponse_QNAME = new QName("http://www.ect888.com/service/MessageService", "sendMessageResponse");
    private final static QName _ShortMsgId_QNAME = new QName("http://www.ect888.com/metadata", "shortMsgId");
    private final static QName _ChannelId_QNAME = new QName("http://www.ect888.com/metadata", "channelId");
    private final static QName _RequestId_QNAME = new QName("http://www.ect888.com/metadata", "requestId");
    private final static QName _Urgent_QNAME = new QName("http://www.ect888.com/metadata", "urgent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ect.sms.client.MessageService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMessageResponseBodyType }
     * 
     */
    public SendMessageResponseBodyType createSendMessageResponseBodyType() {
        return new SendMessageResponseBodyType();
    }

    /**
     * Create an instance of {@link SendMessageResponseBodyType.SHEAD }
     * 
     */
    public SendMessageResponseBodyType.SHEAD createSendMessageResponseBodyTypeSHEAD() {
        return new SendMessageResponseBodyType.SHEAD();
    }

    /**
     * Create an instance of {@link SendMessageBodyType }
     * 
     */
    public SendMessageBodyType createSendMessageBodyType() {
        return new SendMessageBodyType();
    }

    /**
     * Create an instance of {@link SendMessageResponseBodyType.SBODY }
     * 
     */
    public SendMessageResponseBodyType.SBODY createSendMessageResponseBodyTypeSBODY() {
        return new SendMessageResponseBodyType.SBODY();
    }

    /**
     * Create an instance of {@link SendMessageResponseBodyType.SHEAD.Ret }
     * 
     */
    public SendMessageResponseBodyType.SHEAD.Ret createSendMessageResponseBodyTypeSHEADRet() {
        return new SendMessageResponseBodyType.SHEAD.Ret();
    }

    /**
     * Create an instance of {@link SendMessageBodyType.SHEAD }
     * 
     */
    public SendMessageBodyType.SHEAD createSendMessageBodyTypeSHEAD() {
        return new SendMessageBodyType.SHEAD();
    }

    /**
     * Create an instance of {@link SendMessageBodyType.SBODY }
     * 
     */
    public SendMessageBodyType.SBODY createSendMessageBodyTypeSBODY() {
        return new SendMessageBodyType.SBODY();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "mobPhoNo")
    public JAXBElement<String> createMobPhoNo(String value) {
        return new JAXBElement<String>(_MobPhoNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "responseId")
    public JAXBElement<String> createResponseId(String value) {
        return new JAXBElement<String>(_ResponseId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "channelSerialNo")
    public JAXBElement<String> createChannelSerialNo(String value) {
        return new JAXBElement<String>(_ChannelSerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "attime")
    public JAXBElement<String> createAttime(String value) {
        return new JAXBElement<String>(_Attime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "userId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "routeInfo")
    public JAXBElement<String> createRouteInfo(String value) {
        return new JAXBElement<String>(_RouteInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "MsgId")
    public JAXBElement<String> createMsgId(String value) {
        return new JAXBElement<String>(_MsgId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "ret")
    public JAXBElement<String> createRet(String value) {
        return new JAXBElement<String>(_Ret_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/service/MessageService", name = "sendMessage")
    public JAXBElement<SendMessageBodyType> createSendMessage(SendMessageBodyType value) {
        return new JAXBElement<SendMessageBodyType>(_SendMessage_QNAME, SendMessageBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "pszSubPort")
    public JAXBElement<String> createPszSubPort(String value) {
        return new JAXBElement<String>(_PszSubPort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "requestTime")
    public JAXBElement<String> createRequestTime(String value) {
        return new JAXBElement<String>(_RequestTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "bizType")
    public JAXBElement<String> createBizType(String value) {
        return new JAXBElement<String>(_BizType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "msgContent")
    public JAXBElement<String> createMsgContent(String value) {
        return new JAXBElement<String>(_MsgContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "retType")
    public JAXBElement<String> createRetType(String value) {
        return new JAXBElement<String>(_RetType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "retMessage")
    public JAXBElement<String> createRetMessage(String value) {
        return new JAXBElement<String>(_RetMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "headVersion")
    public JAXBElement<String> createHeadVersion(String value) {
        return new JAXBElement<String>(_HeadVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "retCode")
    public JAXBElement<String> createRetCode(String value) {
        return new JAXBElement<String>(_RetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "Param3")
    public JAXBElement<String> createParam3(String value) {
        return new JAXBElement<String>(_Param3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "ext1")
    public JAXBElement<String> createExt1(String value) {
        return new JAXBElement<String>(_Ext1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "sysSerialNo")
    public JAXBElement<String> createSysSerialNo(String value) {
        return new JAXBElement<String>(_SysSerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "Param4")
    public JAXBElement<String> createParam4(String value) {
        return new JAXBElement<String>(_Param4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "extraData")
    public JAXBElement<String> createExtraData(String value) {
        return new JAXBElement<String>(_ExtraData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "targetId")
    public JAXBElement<String> createTargetId(String value) {
        return new JAXBElement<String>(_TargetId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/service/MessageService", name = "sendMessageResponse")
    public JAXBElement<SendMessageResponseBodyType> createSendMessageResponse(SendMessageResponseBodyType value) {
        return new JAXBElement<SendMessageResponseBodyType>(_SendMessageResponse_QNAME, SendMessageResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "shortMsgId")
    public JAXBElement<String> createShortMsgId(String value) {
        return new JAXBElement<String>(_ShortMsgId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "channelId")
    public JAXBElement<String> createChannelId(String value) {
        return new JAXBElement<String>(_ChannelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "requestId")
    public JAXBElement<String> createRequestId(String value) {
        return new JAXBElement<String>(_RequestId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ect888.com/metadata", name = "urgent")
    public JAXBElement<String> createUrgent(String value) {
        return new JAXBElement<String>(_Urgent_QNAME, String.class, null, value);
    }

}
