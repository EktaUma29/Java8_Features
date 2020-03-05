package com.spring.demo.hello;

public class B {
	private int b;
	private String msg;

	public B(int b, String msg) {
		System.out.println("B.B(int b, String msg): class constructor");
		this.b = b;
		this.msg = msg;
	}

	public void show() {
		System.out.println("B.show(): Called.....");
		System.out.println("b :" + b + "msg:" + msg);
	}
	
	public void bMethod(){
		System.out.println("B.bMethod():  Called.....");
	}
	
	public B() {
		System.out.println("B.B(): default Constructor....");
	}

}
