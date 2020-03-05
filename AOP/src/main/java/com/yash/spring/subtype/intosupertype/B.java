package com.yash.spring.subtype.intosupertype;

public class B extends A{
	
	private int b;
	private String msg;
	
	public B(int b, String msg) {
		super();
		this.b = b;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", msg=" + msg + "]";
	}
	
	
	

}
