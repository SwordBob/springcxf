package com.test.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IService {
	public @WebResult(name = "String")
	String get(@WebParam(name = "id") String id);
	public @WebResult(name = "String")
	String doGet(@WebParam(name = "id") String id);
}
