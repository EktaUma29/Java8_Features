package com.javacodegeeks.delimiters.tdd;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "//2;5";
		String reg = "//";
		int sum =0;
		ArrayList<Object> list = new ArrayList<>();
		String[] strArray = str.split("[//\\n;,]");
		for(String s : strArray){
			System.out.print(sum +Integer.parseInt(s));
			
		
		}
//		list.forEach(System.out::println);
	}

}
