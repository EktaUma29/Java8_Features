package com.spring.demo.employee;

import org.springframework.stereotype.Component;

@Component
public class B {

	A a;
	

//	public B(A a) {
//		super();
//		this.a = a;
//	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
