package com.practice;

import java.util.stream.IntStream;

public class FactorialJava8 {

	public static void main(String[] args) {


		IntStream.iterate(1, n -> n + 1)
			.limit(4).map(FactorialJava8::factorial)
			.forEach(System.out::println);

	}

	static Integer factorial(int number) {

		return IntStream.rangeClosed(1, number)
				.reduce(1, (x, y) -> x * y);
	}

}
