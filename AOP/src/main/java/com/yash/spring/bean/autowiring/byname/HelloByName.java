package com.yash.spring.bean.autowiring.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloByName {
	
	@Autowired
	@Qualifier("stuObj")
	private Student student;
	
	@Autowired(required = false)
	@Qualifier("address")
	private Address address;
	

	public void showHelloBeanName(){
		
		System.out.println("Hello showHelloBeanName()");
		
		System.out.println("student \t" +student);
		
		System.out.println("address \t" +address);
	}
	
}
