package com.yash.spring.subtype.intosupertype;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	@Autowired
	private A aobj;
	
	
	public void setAobj(A aobj) {
		System.out.println("Hello.setAobj()");
		this.aobj = aobj;
	}


	public void showHello(){
		
		System.out.println("Hello showHello");
		
		System.out.println("A \t" +aobj);
		
	}
	
}
