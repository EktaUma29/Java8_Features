package com.yash.spring.bean.loading.type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.spring.bean.scope.Hello;
import com.yash.spring.bean.scope.HelloConfig;

public class BeanLoadingMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
	       
	       System.out.println("Spring container is Ready");
	       System.out.println("============");
	       
	       Hello helloFirst = (Hello)ctx.getBean("hello");
	       Hello helloSecond = (Hello)ctx.getBean("hello");
	       System.out.println(helloFirst == helloSecond);
	       ctx.close();
	    }
	}

