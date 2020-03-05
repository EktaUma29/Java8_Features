package com.yash.spring.bean.autowiring.byname;

public class Address {

	private Integer pincode;

	private String area;

	public Address(Integer pincode, String area) {
		this.pincode = pincode;
		this.area = area;
	}

	@Override
	public String toString() {
		return "B [pincode=" + pincode + ", area=" + area + "]";
	}


	
	

}
