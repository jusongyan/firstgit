package com.ect.nrac.cmc.sms.esb;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
public final class ESBServerPortType_ESBServerSoapEndpoint_Client {

    private static final QName SERVICE_NAME = new QName("http://www.ect888.com/service/MessageService/wsdl", "MessageService");

    private ESBServerPortType_ESBServerSoapEndpoint_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MessageService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        MessageService ss = new MessageService(wsdlURL, SERVICE_NAME);
        ESBServerPortType port = ss.getESBServerSoapEndpoint();  
        
        {
        System.out.println("Invoking sendMessage...");
        com.ect.nrac.cmc.sms.esb.SendMessageBodyType.SHEAD _sendMessage_shead = null;
        com.ect.nrac.cmc.sms.esb.SendMessageBodyType.SBODY _sendMessage_sbody = null;
        javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SHEAD> _sendMessage_shead1 = new javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SHEAD>();
        javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SBODY> _sendMessage_sbody1 = new javax.xml.ws.Holder<com.ect.nrac.cmc.sms.esb.SendMessageResponseBodyType.SBODY>();
        port.sendMessage(_sendMessage_shead, _sendMessage_sbody, _sendMessage_shead1, _sendMessage_sbody1);

        System.out.println("sendMessage._sendMessage_shead1=" + _sendMessage_shead1.value);
        System.out.println("sendMessage._sendMessage_sbody1=" + _sendMessage_sbody1.value);

        }

        System.exit(0);
    }

}
