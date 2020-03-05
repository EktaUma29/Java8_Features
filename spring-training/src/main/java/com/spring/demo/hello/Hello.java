package com.spring.demo.hello;

public class Hello {

	private A a;
	private B b;
	

	public A getA() {
		System.out.println("Hello.getA(): returing A class");
		return a;
	}

	public void setA(A a) {
		System.out.println("Hello.setA(): object");
		this.a = a;
	}

	public Hello(B b) {
		System.out.println("Hello.Hello(B b): class Constructor with B agrs...");
		this.b = b;
	}
	
	public Hello(A a) {
		System.out.println("Hello.Hello(A a): class Constructor with A agrs...");
		this.a = a;
	}
	
	public Hello() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello.Hello(): Default Constructor...");
	}
	
	public void show(){
		System.out.println("Hello.show(): Called\n\n");
//		a.show();
//		b.show();
	}
}
