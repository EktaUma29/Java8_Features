package com.spring.demo.hello;

public class A {

	private int a;
	private String msg;

	public A() {
		System.out.println("A.A(): Default Constructor....");
	}

	
	
	public A(int a, String msg) {
		super();
		System.out.println("A.A(parameter): Constructor");
		this.a = a;
		this.msg = msg;
	}



	public void setMsg(String msg) {
		System.out.println("A.setMsg(): Setter Message");
		this.msg = msg;
	}

	public void setA(int a) {
		System.out.println("A.setA(): Setter SetA....");
		this.a = a;
	}

	public void show() {
		System.out.println("A.show(): object Show();");
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", msg=" + msg + "]";
	}

}
