package com.test.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2017-08-14T16:02:05.827+08:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://service.cxf.test.com/", name = "IService")
@XmlSeeAlso({ObjectFactory.class})
public interface IService {

    @WebResult(name = "String", targetNamespace = "")
    @RequestWrapper(localName = "get", targetNamespace = "http://service.cxf.test.com/", className = "com.test.cxf.service.Get")
    @WebMethod
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://service.cxf.test.com/", className = "com.test.cxf.service.GetResponse")
    public java.lang.String get(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );
}
