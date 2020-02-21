package com.ect.nrac.cmc.sms.esb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
@WebService(targetNamespace = "http://www.ect888.com/service/MessageService/wsdl", name = "ESBServerPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ESBServerPortType {

    @RequestWrapper(localName = "sendMessage", targetNamespace = "http://www.ect888.com/service/MessageService", className = "com.ect.sms.client.MessageService.SendMessageBodyType")
    @WebMethod(action = "urn:/sendMessage")
    @ResponseWrapper(localName = "sendMessageResponse", targetNamespace = "http://www.ect888.com/service/MessageService", className = "com.ect.sms.client.MessageService.SendMessageResponseBodyType")
    public void sendMessage(
        @WebParam(name = "SHEAD", targetNamespace = "http://www.ect888.com/service/MessageService")
        com.ect.nrac.cmc.sms.esb.SendMessageBodyType.SHEAD shead,
        @WebParam(name = "SBODY", targetNamespace = "http://www.ect888.com/service/MessageService")
        com.ect.nrac.cmc.sms.esb.SendMessageBodyType.SBODY sbody,
        @WebParam(mode = WebParam.Mode.OUT, name = "SHEAD", targetNamespace = "http://www.ect888.com/service/MessageService")
        javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SHEAD> shead1,
        @WebParam(mode = WebParam.Mode.OUT, name = "SBODY", targetNamespace = "http://www.ect888.com/service/MessageService")
        javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SBODY> sbody1
    );
}
