package com.javacodegeeks.junit;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
/*import org.junit.jupiter.api.Test;*/
import org.junit.Test;

class AnnotationsTest {

	private ArrayList<String> testList;

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		System.out.println("@BeforeClass: onceExecutedBeforeAll");
	}

	@Before
	public void executedBeforeEach() {
		testList = new ArrayList<String>();
		testList.add("@Before");
		System.out.println("@Before: executedBeforeEach");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		System.out.println("@AfterClass: onceExecutedAfterAll");
	}

	@After
	public void executedAfterEach() {
		testList.clear();
		System.out.println("@After: executedAfterEach");
	}

	@Test
	public void EmptyCollection() {
		//assertTrue(testList.isEmpty());
		System.out.println("@Test: EmptyArrayList");
	}

	/*
	 * @Test public void OneItemCollection() { //testList.add("oneItem");
	 * //assertEquals(0, testList.size());
	 * System.out.println("@Test: OneItemArrayList"); }
	 */

	@Ignore
	public void executionIgnored() {
		System.out.println("@Ignore: This execution is ignored");
	}

}
