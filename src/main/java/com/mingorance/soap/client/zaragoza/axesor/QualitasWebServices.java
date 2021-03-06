
package com.mingorance.soap.client.zaragoza.axesor;

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
@WebServiceClient(name = "QualitasWebServices", targetNamespace = "http://www.axesor.es/", wsdlLocation = "http://qualitasws.axesor.es/QualitasWebServices.asmx?wsdl")
public class QualitasWebServices
    extends Service
{

    private final static URL QUALITASWEBSERVICES_WSDL_LOCATION;
    private final static WebServiceException QUALITASWEBSERVICES_EXCEPTION;
    private final static QName QUALITASWEBSERVICES_QNAME = new QName("http://www.axesor.es/", "QualitasWebServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://qualitasws.axesor.es/QualitasWebServices.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUALITASWEBSERVICES_WSDL_LOCATION = url;
        QUALITASWEBSERVICES_EXCEPTION = e;
    }

    public QualitasWebServices() {
        super(__getWsdlLocation(), QUALITASWEBSERVICES_QNAME);
    }

    public QualitasWebServices(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUALITASWEBSERVICES_QNAME, features);
    }

    public QualitasWebServices(URL wsdlLocation) {
        super(wsdlLocation, QUALITASWEBSERVICES_QNAME);
    }

    public QualitasWebServices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUALITASWEBSERVICES_QNAME, features);
    }

    public QualitasWebServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QualitasWebServices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QualitasWebServicesSoap
     */
    @WebEndpoint(name = "QualitasWebServicesSoap")
    public QualitasWebServicesSoap getQualitasWebServicesSoap() {
        return super.getPort(new QName("http://www.axesor.es/", "QualitasWebServicesSoap"), QualitasWebServicesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QualitasWebServicesSoap
     */
    @WebEndpoint(name = "QualitasWebServicesSoap")
    public QualitasWebServicesSoap getQualitasWebServicesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.axesor.es/", "QualitasWebServicesSoap"), QualitasWebServicesSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUALITASWEBSERVICES_EXCEPTION!= null) {
            throw QUALITASWEBSERVICES_EXCEPTION;
        }
        return QUALITASWEBSERVICES_WSDL_LOCATION;
    }

}
