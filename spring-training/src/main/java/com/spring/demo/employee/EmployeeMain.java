package com.spring.demo.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("employee-spring.xml");
		Employee a = (Employee) context.getBean("a");
//		((AbstractApplicationContext) context).close();
		
		System.out.println(a.hashCode());
		
		Employee b = (Employee) context.getBean("b");
		Employee c = (Employee) context.getBean("b");
		
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		((AbstractApplicationContext) context).close();
		
		
		LongStream.
	}

}
