package com.javacodegeeks.tdd.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	Calculator calculator = new Calculator();

	int sum = 0;

	@Test
	public void shouldReturnZeroWhenStringIsEmpty() {

		sum = calculator.addition("");
		assertEquals(0, sum);
	}

	@Test
	public void shouldReturnSameNumberWhenNumberIsOneDigit() {
		sum = calculator.addition("1");
		assertEquals(1, sum);
	}

	@Test
	public void shouldReturnSumIfTwoNumbersIsGiven() {
		sum = calculator.addition("5,6");
		assertEquals(11, sum);
	}

	@Test
	public void shouldReturnSumOFAllNumbers() {
		sum = calculator.addition("1,2,3,4,5");
		assertEquals(15, sum);
	}

	@Test
	public void shouldReturnSumOfAllNumbersAndAcceptNewLineDelimiter() {
		sum = calculator.addition("1\n2,3");
		assertEquals(6, sum);
	}

	@Test
	public void shouldReturnSumOfAllNumbersAndAcceptOthersDelimiter() {
		sum = calculator.addition("//;\n1;2");
		assertEquals(3, sum);
	}

	@Test
	public void shouldThrowExceptionIfNumberIsNegative() {
		thrown.expect(NegativesNotAllowed.class);
		thrown.expectMessage("Negatives Number Not Allowed");
		calculator.addition("-2,6");
	}

	@Test
	public void shouldIgnoreNumberIfNumberIsGreaterThanThousand() {
		sum = calculator.addition("2,1001");
		assertEquals(2, sum);
	}
}
