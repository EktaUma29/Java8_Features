package com.practice;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABCDEG";
		boolean flag = true;
		int length = 0;
		try {
			while (flag) {
				length++;
				str.charAt(length);
			}
		} catch (Exception e) {
			System.out.println(length);
		}
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}