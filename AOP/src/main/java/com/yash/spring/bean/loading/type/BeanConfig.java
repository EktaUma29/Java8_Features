package com.yash.spring.bean.loading.type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.yash.spring.bean.scope.Hello;

public class BeanConfig {
	
	@Bean
	@Scope("singleton")
	@Lazy(true)
	public Hello hello(){
		return new Hello();
	}

}
