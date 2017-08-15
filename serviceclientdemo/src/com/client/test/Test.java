package com.client.test;

import com.demo.service.client.ServiceImplServiceLocator;
import com.demo.service.client.ServiceImplServiceSoapBindingStub;

public class Test {

	public static void main(String[] args) {
		try {
			ServiceImplServiceLocator iService = new ServiceImplServiceLocator();
			ServiceImplServiceSoapBindingStub service = (ServiceImplServiceSoapBindingStub) iService.getServiceImplPort();
			String  str = service.get("test");
			System.out.println(str+"  ---------------------");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
