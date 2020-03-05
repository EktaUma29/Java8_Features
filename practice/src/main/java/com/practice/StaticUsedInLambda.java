package com.practice;

import java.util.function.Function;

interface I {
	public void m1(int a, int b);
}

public class StaticUsedInLambda {

	int k = 10;

	Function<Integer, Integer> function = (s) -> {

		k = 30;

		return s * k;

	};

	int kavi = function.apply(3);

	public static void main(String args[]) {

		StaticUsedInLambda lam = new StaticUsedInLambda();
		System.out.println(lam.kavi);

	}

}
