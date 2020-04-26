package org.prac.spring.MockitoPrac;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void test_mutipleReturn() {
		List mocklist=mock(List.class);
		when(mocklist.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, mocklist.size());
		assertEquals(20, mocklist.size());
	}
	
	@Test
	public void test_get_func() {
		List mocklist=mock(List.class);
		when(mocklist.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString", mocklist.get(0));
		assertEquals("SomeString", mocklist.get(1));
	}
}
