package com.yash.spring.bean.autowiring.byname;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ByNameMainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ByNameConfigration.class);
	    
	    System.out.println("Spring container is Ready");
	    System.out.println("============");
	    
	    HelloByName helloFirst = (HelloByName)ctx.getBean("helloByName");
	    helloFirst.showHelloBeanName();
	    
	    ctx.close();
		
	}
	
	
 }

