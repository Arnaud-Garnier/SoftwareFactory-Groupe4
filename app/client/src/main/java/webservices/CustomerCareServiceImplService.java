
package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerCareServiceImplService", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/customer-care", wsdlLocation = "file:/home/user/Documents/SI4/S2/DevOps/SoftFact/SoftwareFactory-Groupe4/app/client/src/main/resources/CustomerCareWS.wsdl")
public class CustomerCareServiceImplService
    extends Service
{

    private final static URL CUSTOMERCARESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERCARESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CUSTOMERCARESERVICEIMPLSERVICE_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/tcf/customer-care", "CustomerCareServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/user/Documents/SI4/S2/DevOps/SoftFact/SoftwareFactory-Groupe4/app/client/src/main/resources/CustomerCareWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERCARESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CUSTOMERCARESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CustomerCareServiceImplService() {
        super(__getWsdlLocation(), CUSTOMERCARESERVICEIMPLSERVICE_QNAME);
    }

    public CustomerCareServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERCARESERVICEIMPLSERVICE_QNAME, features);
    }

    public CustomerCareServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERCARESERVICEIMPLSERVICE_QNAME);
    }

    public CustomerCareServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERCARESERVICEIMPLSERVICE_QNAME, features);
    }

    public CustomerCareServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerCareServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerCareService
     */
    @WebEndpoint(name = "CustomerCareServiceImplPort")
    public CustomerCareService getCustomerCareServiceImplPort() {
        return super.getPort(new QName("http://www.polytech.unice.fr/si/4a/isa/tcf/customer-care", "CustomerCareServiceImplPort"), CustomerCareService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerCareService
     */
    @WebEndpoint(name = "CustomerCareServiceImplPort")
    public CustomerCareService getCustomerCareServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.polytech.unice.fr/si/4a/isa/tcf/customer-care", "CustomerCareServiceImplPort"), CustomerCareService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERCARESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CUSTOMERCARESERVICEIMPLSERVICE_EXCEPTION;
        }
        return CUSTOMERCARESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}