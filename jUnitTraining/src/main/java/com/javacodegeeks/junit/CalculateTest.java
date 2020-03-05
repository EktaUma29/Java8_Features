package com.javacodegeeks.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
	Calculate calculation = new Calculate();
	int sum = calculation.sum(2, 5);
	int testSum = 7;

	@Test
	public void testSum() {
		System.out.println("Test Sum= " + sum + " = " + testSum);
		calculation.sum(1, 7);
		assertEquals(testSum, sum);
	}
}
