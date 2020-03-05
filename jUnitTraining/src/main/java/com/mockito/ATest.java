package com.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ATest {

	@Test
	public void testFirstMethod() {

		List<String> mockedList = mock(MyList.class);
		mockedList.size();
		when(mockedList.size()).thenReturn(0);
		verify(mockedList, times(1)).size();
	}
}
