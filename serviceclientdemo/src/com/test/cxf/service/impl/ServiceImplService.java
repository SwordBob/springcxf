package com.test.cxf.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.test.cxf.service.IService;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2017-08-14T16:02:05.835+08:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebServiceClient(name = "ServiceImplService", 
                  wsdlLocation = "http://localhost:8080/serviceserverdemo/IService?wsdl",
                  targetNamespace = "http://impl.service.cxf.test.com/") 
public class ServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.cxf.test.com/", "ServiceImplService");
    public final static QName ServiceImplPort = new QName("http://impl.service.cxf.test.com/", "ServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/serviceserverdemo/IService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/serviceserverdemo/IService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "ServiceImplPort")
    public IService getServiceImplPort() {
        return super.getPort(ServiceImplPort, IService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "ServiceImplPort")
    public IService getServiceImplPort(WebServiceFeature... features) {
        return super.getPort(ServiceImplPort, IService.class, features);
    }

}
