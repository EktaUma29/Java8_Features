package com.api.spring.rest.hello;

public class Hello {

	String title;
	String value;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Hello(String title, String value) {
		super();
		this.title = title;
		this.value = value;
	}
	
	
}
