package com.yash.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.spring.di.DIConfig;
import com.yash.spring.di.Hello;

/**
 * Hello world!
 *
 */

//@SpringBootApplication
public class SpringBootApp 
{
    public static void main( String[] args )
    {
       // SpringApplication.run(SpringBootApp.class, args);
        
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfig.class);
       
       System.out.println("Spring container is Ready");
       
       Hello hello = (Hello)ctx.getBean("hello");
       hello.showHello();
       ctx.close();
    }
}
