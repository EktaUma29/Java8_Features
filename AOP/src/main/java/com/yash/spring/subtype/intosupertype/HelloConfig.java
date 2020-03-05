package com.yash.spring.subtype.intosupertype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
	
	@Bean
	public Hello hello(){
		
		Hello hello = new Hello();
		return hello;
	}
	
	@Bean
	public A createA(){
		
		A aobj = new A();
		aobj.setA(10);
		aobj.setMsg("Pappu");
		return aobj;
	}
	
	@Bean
	public B createB(){
		
		return new B(20, "Rout");
	}

}
