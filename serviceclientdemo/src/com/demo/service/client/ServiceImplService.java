/**
 * ServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.demo.service.client;

public interface ServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getServiceImplPortAddress();

    public com.demo.service.client.IService getServiceImplPort() throws javax.xml.rpc.ServiceException;

    public com.demo.service.client.IService getServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
