package com.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {

		int number = 5;
		
		int fact = IntStream.range(1, number)
			.reduce(1, (a, b) -> a*b );
		
		System.out.println(fact);
		
		
	}

}
