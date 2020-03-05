package com.majesco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {

	public static void main(String[] args) {

		System.out.println("Before Application Context");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Application context called");
		Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust.getName());
	}

}
