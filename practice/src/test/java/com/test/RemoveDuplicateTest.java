package com.test;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import junit.framework.Assert;


@RunWith(JUnit4ClassRunner.class)
public class RemoveDuplicateTest {
	
	
	

	@Test
	public void shouldRemoveDuplicateFromList() {

		List<Integer> list = Arrays.asList(1, 2, 1, 3, 5, 3, 4, 5);
		
		List<Integer> actualList = RemoveDuplicate.removeDuplicate(list);
		
		Assert.assertEquals(Arrays.asList(1, 2, 3, 5, 4), actualList);
		
		
		
	}

}
