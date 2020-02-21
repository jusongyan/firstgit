package com.ect.nrac.cmc.sms.esb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * 
 * @author wucg
 * @since 2018-3-8
 * 
 */
@WebServiceClient(name = "MessageService", 
                  wsdlLocation = "file:/E:/java/cxf/wsdl/wsdlTemp/MessageService.wsdl",
                  targetNamespace = "http://www.ect888.com/service/MessageService/wsdl") 
public class MessageService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.ect888.com/service/MessageService/wsdl", "MessageService");
    public final static QName ESBServerSoapEndpoint = new QName("http://www.ect888.com/service/MessageService/wsdl", "ESBServerSoapEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/java/cxf/wsdl/wsdlTemp/MessageService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MessageService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/java/cxf/wsdl/wsdlTemp/MessageService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MessageService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MessageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MessageService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ESBServerPortType
     */
    @WebEndpoint(name = "ESBServerSoapEndpoint")
    public ESBServerPortType getESBServerSoapEndpoint() {
        return super.getPort(ESBServerSoapEndpoint, ESBServerPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ESBServerPortType
     */
    @WebEndpoint(name = "ESBServerSoapEndpoint")
    public ESBServerPortType getESBServerSoapEndpoint(WebServiceFeature... features) {
        return super.getPort(ESBServerSoapEndpoint, ESBServerPortType.class, features);
    }

}
