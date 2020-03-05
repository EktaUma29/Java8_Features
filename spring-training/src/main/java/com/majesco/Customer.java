package com.majesco;

import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean {

	private int custId;
	private String name;

	public void init() {
		System.out.println("init() called phill");
		this.setName("Phill");
	}

	public synchronized int getCustId() {
		return custId;
	}

	public synchronized void setCustId(int custId) {
		this.custId = custId;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet:\n " + this.getName());
		this.setName("Bill");

	}

}
