package com.yash.spring.aop.second;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionService {
	
	@Pointcut(value = "execution(* com.yash.spring.aop.AccountService.my*(..))")
	public void method1(){
		
	}
	
	@Pointcut(value = "execution(* com.yash.spring.aop.CustomerService.up*(..))")
	public void method2(){
		
	}
	

	@Around(value = "method1() or method2()")
	public void runTransaction(ProceedingJoinPoint  proceedingJoinPoint) throws Throwable{
		
		System.out.println("TransactionService  runTransaction Begin ===");
		
		proceedingJoinPoint.proceed();
		commit();
		
		System.out.println("SecurityService  runTransaction End ===");
	}
	
	public void transactionBegin(){
		System.out.println("TransactionService transactionBegin()");
	}
	
	public void commit(){
		System.out.println("TransactionService commit()");
		
	}
	
	@AfterThrowing("method1() or method2()")
	public void rollback(){
		System.out.println("LogService rollback ()");
		
	}
	

}
