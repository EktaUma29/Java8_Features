package com.yash.spring.aop.second;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void addCustomer() {
		System.out.println("CustomerServiceImpl addCustomer ===> Begin");
		System.out.println("CustomerServiceImpl addCustomer ===> Done");
		System.out.println("CustomerServiceImpl addCustomer ===> End");
		
	}

	@Override
	public void updateCustomer() {
		System.out.println("CustomerServiceImpl updateCustomer ===> Begin");
		System.out.println("CustomerServiceImpl updateCustomer ===> Done");
		System.out.println("CustomerServiceImpl updateCustomer ===> End");
		
	}

}
