package com.application.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(Employee.class)
public class ApplicationPropertiesClass {
	
	
	public static void main(String args[]) {
		SpringApplication.run(ApplicationPropertiesClass.class, args);
		 
	}

}
