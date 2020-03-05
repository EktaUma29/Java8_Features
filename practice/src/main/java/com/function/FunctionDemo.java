package com.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> function1 = i -> i * 2;
		Function<Integer, Integer> function2 = i -> i * i * i;

		System.out.println("Compose: " + function1.compose(function2).apply(2));

		System.out.println("AndThen: " + function1.andThen(function2).apply(2));

		System.out.println("Function.identity() "+ Function.identity().apply(7));
		
		
//		Predicate<Integer> predicate = p -> p % 2 ==0;
//		
//		System.out.println("Predicates "+predicate.test(3));
//		
//		Predicate<String> str = Predicate.isEqual("Kavi");
//		
//		System.out.println("Predicate.isEqualpredicate "+ str.test("Kavi"));
		
		
		
	}

}
