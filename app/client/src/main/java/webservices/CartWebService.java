
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CartWebService", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CartWebService {


    /**
     * 
     * @param customerName
     * @return
     *     returns java.util.List<webservices.Item>
     * @throws UnknownCustomerException_Exception
     */
    @WebMethod
    @WebResult(name = "cart_contents", targetNamespace = "")
    @RequestWrapper(localName = "getCustomerCartContents", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.GetCustomerCartContents")
    @ResponseWrapper(localName = "getCustomerCartContentsResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.GetCustomerCartContentsResponse")
    public List<Item> getCustomerCartContents(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName)
        throws UnknownCustomerException_Exception
    ;

    /**
     * 
     * @param item
     * @param customerName
     * @throws UnknownCustomerException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeItemToCustomerCart", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.RemoveItemToCustomerCart")
    @ResponseWrapper(localName = "removeItemToCustomerCartResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.RemoveItemToCustomerCartResponse")
    public void removeItemToCustomerCart(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName,
        @WebParam(name = "item", targetNamespace = "")
        Item item)
        throws UnknownCustomerException_Exception
    ;

    /**
     * 
     * @param item
     * @param customerName
     * @throws UnknownCustomerException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addItemToCustomerCart", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.AddItemToCustomerCart")
    @ResponseWrapper(localName = "addItemToCustomerCartResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.AddItemToCustomerCartResponse")
    public void addItemToCustomerCart(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName,
        @WebParam(name = "item", targetNamespace = "")
        Item item)
        throws UnknownCustomerException_Exception
    ;

    /**
     * 
     * @param customerName
     * @return
     *     returns java.lang.String
     * @throws UnknownCustomerException_Exception
     * @throws PaymentException_Exception
     */
    @WebMethod
    @WebResult(name = "order_id", targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.Validate")
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://webservice.tcf.isa.polytech.unice.fr/", className = "webservices.ValidateResponse")
    public String validate(
        @WebParam(name = "customer_name", targetNamespace = "")
        String customerName)
        throws PaymentException_Exception, UnknownCustomerException_Exception
    ;

}