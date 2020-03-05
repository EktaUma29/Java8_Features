package com.yash.spring.aop;

public class CustomerServiceImpl implements CustomerService{

	public void addCustomer() {
		System.out.println("CustomerServiceImpl addCustomer ===> Begin");
		System.out.println("CustomerServiceImpl addCustomer ===> Done");
		System.out.println("CustomerServiceImpl addCustomer ===> End");		
	}

	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("CustomerServiceImpl updateCustomer ===> Begin");
		System.out.println("CustomerServiceImpl updateCustomer ===> Done");
		System.out.println("CustomerServiceImpl updateCustomer ===> End");
	}

}
