package com.spring.demo.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;

public class BeanScopeApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		
		Coach coach = context.getBean("MyCoach", Coach.class);

		
		Coach alphaCoach = context.getBean("MyCoach1", Coach.class);
		Coach coach1 = context.getBean("MyCoach1", Coach.class);
		
		
		Boolean result = (coach == alphaCoach);

		out.println("Pointing the same Object: " +result);
		
		out.println("Memory location of Coach: "+ coach);
		out.println("Memory location of Coach: "+ alphaCoach);
		out.println("Memory location of Coach: "+ alphaCoach);
		
	}

}
