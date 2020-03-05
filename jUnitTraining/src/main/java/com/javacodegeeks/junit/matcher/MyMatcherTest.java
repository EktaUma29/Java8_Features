package com.javacodegeeks.junit.matcher;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MyMatcherTest {
	@Test
	public void testWithMatchers() {
		assertThat("this string", is("this string"));
		assertThat(123, is(123));

	}

	/*
	 * @Test public void testWithNotMatchers() {
	 * 
	 * assertThat(123, not(is(345)));
	 * 
	 * }
	 */
}
