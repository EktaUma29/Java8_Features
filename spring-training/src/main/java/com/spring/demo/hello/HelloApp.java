package com.spring.demo.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("hello-Spring-XML.xml"); //constructor will call
		
		System.out.println("Container Ready... \n\n");
		Hello hello = context.getBean("Hello", Hello.class);

//		hello.show();
//		hello.getA();

	}

}
