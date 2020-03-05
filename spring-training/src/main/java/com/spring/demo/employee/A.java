package com.spring.demo.employee;

import org.springframework.stereotype.Component;

@Component
public class A {

	B b;

//	public A(B b) {
//		super();
//		this.b = b;
//	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void doSomeThing() {
		System.out.println("Doing some work");
	}
}
