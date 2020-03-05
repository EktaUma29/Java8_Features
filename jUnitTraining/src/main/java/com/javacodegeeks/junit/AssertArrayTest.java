package com.javacodegeeks.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertArrayTest {

	@Test
	void checkArray() {
		int Array1[] = { 1, 2, 3 };
		int Array2[] = { 1, 2, 3 };
		String obj1 = "junit";
		String obj2 = "junit";
		String obj3 = "test";
		String obj4 = "test";
		String obj5 = null;
		int var1 = 1;
		int var2 = 1;

		assertArrayEquals(Array1, Array2);
		assertEquals(var1, var2);

		assertEquals(obj1, obj2);
		assertSame(obj3, obj4);
		assertNotSame(obj2, obj4);
		assertNull(obj5);
		assertNotEquals(var1, var2);
		// assertTrue(var1, var2);

		// assertThat("test", AnyOf(is("test2"), containsString("te")) );

	}

}
