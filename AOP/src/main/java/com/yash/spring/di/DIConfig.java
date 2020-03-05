package com.yash.spring.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfig {
	
	@Bean
	public Address createAddress(){
		
		return new Address(411028, "Hadapsar");
	}
	
	@Bean
	public Student createStudent(){
		
		Student student = new Student();
		student.setStudentId(1002760);
		student.setStudentName("Pappu Rout");
		
		return student;
	}
	
	@Bean
	public Hello hello( Address address, Student student){
		
		Hello hello = new Hello(address);
		hello.setStudent(student);
		return hello;
	}
}
