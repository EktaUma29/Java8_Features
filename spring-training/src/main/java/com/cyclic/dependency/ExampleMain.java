package com.cyclic.dependency;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import com.spring.demo.employee.A;
//
//@ComponentScan(basePackages = { "com.cyclic.dependency.BeanA", "com.cyclic.dependency.BeanB"})
//public class ExampleMain {
//
//    public static void main(String[] args) {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(com.spring.demo.employee.A.class);
//        A beanA = context.getBean(com.spring.demo.employee.A.class);
//        beanA.doSomething();
//    }
//
//}