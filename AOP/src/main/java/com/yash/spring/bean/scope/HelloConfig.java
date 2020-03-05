package com.yash.spring.bean.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloConfig {
	
	@Bean
	@Scope(value = "prototype")
	public Hello hello(){
		return new Hello();
	}

}
