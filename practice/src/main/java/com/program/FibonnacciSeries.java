package com.program;

public class FibonnacciSeries {

	public static void main(String[] args) {

		System.out.println(fib(4));
		
	}

	private static int fib(int n) {

		if(n<0)
			return 0;
		else if(n == 1)
			return 1;
		else
		return fib(n-2) + fib(n-1);
	}

}
