package com.yash.spring.bean.autowiring.byname;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yash.spring.di.Address;

@Configuration
public class ByNameConfigration {
	
	@Bean
	public Student stuObj(){
		
		Student stuObj = new Student();
		stuObj.setStudentId(1002760);
		stuObj.setStudentName("Pappu Rout");
		
		return stuObj;
	}
	
	@Bean
	public HelloByName helloByName(){
		
		return new HelloByName();
	}
	
	
	@Bean
	public Address address(){
		
		return new Address(1002761, "Yash");
	}

}
