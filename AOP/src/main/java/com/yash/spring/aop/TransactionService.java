package com.yash.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionService {
	
	@Pointcut(value = "execution(* com.yash.spring.aop.AccountService.my*(..))")
	public void method1(){
		
	}
	
	@Pointcut(value = "execution(* com.yash.spring.aop.CustomerService.up*(..))")
	public void method2(){
		
	}
	
	@Before("method1()")
	public void transactionBegin(){
		System.out.println("TransactionService transactionBegin()");
	}
	
	@AfterReturning("method1()")
	public void commit(){
		System.out.println("TransactionService commit()");
		
	}
	
	@AfterThrowing("method1()")
	public void rollback(){
		System.out.println("LogService rollback ()");
		
	}
	

}
