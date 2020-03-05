package com.yash.spring.subtype.intosupertype;

public class A {
	
	private int a;
	private String msg;
	
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "A [a=" + a + ", msg=" + msg + "]";
	}
	
	

}
