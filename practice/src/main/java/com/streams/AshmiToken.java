package com.streams;

public class AshmiToken {

	public static void main(String[] args) {

		String str = "Rajendra Kumar Sharma";
		
		String str1[] = str.split(" ");
		
		char fName =str1[0].charAt(0);
		char mName = str1[1].charAt(0);
		String surName = str1[2];
		
		String name = "" + fName + " " + mName + " " + surName;
		
		System.out.println(name);
		
			
		
	}

}