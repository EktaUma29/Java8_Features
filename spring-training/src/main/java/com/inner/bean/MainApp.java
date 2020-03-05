package com.inner.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("inner-beans.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      TextEditor te1 = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	      
	      
	      SpellChecker sp = (SpellChecker) context.getBean("spellChecker");
	      SpellChecker sp1 = (SpellChecker) context.getBean("spellChecker");
	      
	      
	      System.out.println("Text Editor: te " +te.hashCode());
	      System.out.println("Text Editor: te1 " +te1.hashCode());
	      
	      System.out.println("spellChecker: sp " +sp.hashCode());
	      System.out.println("spellChecker: sp1 " +sp1.hashCode());
	   }
}
