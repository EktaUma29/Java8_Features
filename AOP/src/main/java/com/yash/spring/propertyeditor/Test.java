package com.yash.spring.propertyeditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Integer [] arr = {1,2,3};
		
		List<Integer> listInt = new ArrayList<Integer>();
		
		listInt= Arrays.asList(arr);
		
		listInt.add(4);
		
		System.out.println(listInt.size());
		
		
		
		
		
		
		
		
		/*
		 String str = "yash";
		 String str1 = "tech";

		String str2 = str + str1;
		String str3 = "yashtech";
		
		System.out.println(str2 == str3);*/
		//System.out.println(str2.hashCode() == str3.hashCode());
		
		
		

		//System.out.println(str2.hashCode() == str3.hashCode());
		
		/*
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		
		for (Integer i : listInt) {
			
			
			
		}*/
	}

}
