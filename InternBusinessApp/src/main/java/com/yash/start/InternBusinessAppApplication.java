package com.yash.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration 
@ComponentScan(basePackages="com.yash.*") 
@EntityScan(basePackages="com.yash.entity") 
public class InternBusinessAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternBusinessAppApplication.class, args);
	}

}
