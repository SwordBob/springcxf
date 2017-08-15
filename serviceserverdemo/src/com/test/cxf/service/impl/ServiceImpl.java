package com.test.cxf.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.cxf.service.IService;

@WebService
public class ServiceImpl implements IService {
	private Logger log = LoggerFactory.getLogger(ServiceImpl.class);
	public String get(String str) {
		System.out.println("接收到的参数为:"+str);;
		return "接收到的参数为:"+str;
	}
	@Override
	public String doGet(String id) {
		// TODO Auto-generated method stub
		return "接收到的参数doget:"+id;
	}
}
