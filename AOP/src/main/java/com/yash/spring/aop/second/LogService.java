package com.yash.spring.aop.second;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {
	
	//execution(* com.deere.dpps.services.impl.* .*(..))
	@Pointcut(value = "execution(* com.yash.spring.aop.AccountService.my*(..))")
	public void method1(){
		
	}
	
	@Pointcut(value = "execution(* com.yash.spring.aop.CustomerService.up*(..))")
	public void method2(){
		
	}
	
	@Around(value = "method1() or method2()")
	public void logAround(ProceedingJoinPoint  proceedingJoinPoint) throws Throwable{
		
		System.out.println("LogService logAround() === Begin");
		
		logBefore();
		proceedingJoinPoint.proceed();
		logReturning();
		
		System.out.println("LogService logAround() === End");
	}
	
	public void logBefore(){
		System.out.println("LogService  logBefore ");
		
	}
	
	public void logReturning(){
		System.out.println("LogService logReturning()");
		
	}
	
	@AfterThrowing("method1() or method2()")
	public void logThrowing(){
		System.out.println("LogService logThrowing ()");
		
	}
	
	@After("method1() or method2()")
	public void logOk(){
		System.out.println("LogService logOk ()");
		
	}	
		

}
