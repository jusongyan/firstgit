package com.ect.nrac.cmc.sms.esb;

import java.util.logging.Logger;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
@javax.jws.WebService(
                      serviceName = "MessageService",
                      portName = "ESBServerSoapEndpoint",
                      targetNamespace = "http://www.ect888.com/service/MessageService/wsdl",
                      wsdlLocation = "file:/E:/java/cxf/wsdl/wsdlTemp/MessageService.wsdl",
                      endpointInterface = "com.ect.sms.client.MessageService.ESBServerPortType")
                      
public class ESBServerPortTypeImpl implements ESBServerPortType {

    private static final Logger LOG = Logger.getLogger(ESBServerPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.ect.sms.client.MessageService.ESBServerPortType#sendMessage(com.ect.sms.client.MessageService.SendMessageBodyType.SHEAD  shead ,)com.ect.sms.client.MessageService.SendMessageBodyType.SBODY  sbody ,)com.ect.sms.client.MessageService.SendMessageResponseBodyType.SHEAD  shead1 ,)com.ect.sms.client.MessageService.SendMessageResponseBodyType.SBODY  sbody1 )*
     */
    public void sendMessage(
    		com.ect.nrac.cmc.sms.esb.SendMessageBodyType.SHEAD shead,
    		com.ect.nrac.cmc.sms.esb.SendMessageBodyType.SBODY sbody,
    		javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SHEAD> shead1,
    		javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SBODY> sbody1) { 
        LOG.info("Executing operation sendMessage");
        System.out.println(shead);
        System.out.println(sbody);
        try {
        	com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SHEAD shead1Value = null;
            shead1.value = shead1Value;
            com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SBODY sbody1Value = null;
            sbody1.value = sbody1Value;
            System.out.println("----------------"+shead1Value);
            System.out.println("----------------"+sbody1Value);
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
