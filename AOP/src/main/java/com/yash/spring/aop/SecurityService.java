package com.yash.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {

	@Pointcut(value = "execution(* com.yash.spring.aop.AccountService.my*(..))")
	public void method1(){
		
	}
	
	@Pointcut(value = "execution(* com.yash.spring.aop.CustomerService.up*(..))")
	public void method2(){
		
	}
	
	@Before(value = "method1()")
	public void verifyUser(){
		System.out.println("SecurityService  verifyUser ");
		
	}
}
