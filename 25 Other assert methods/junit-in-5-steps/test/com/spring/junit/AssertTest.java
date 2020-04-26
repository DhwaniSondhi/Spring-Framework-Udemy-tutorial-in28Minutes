package com.spring.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test1() {
		assertEquals(1, 1);
		assertTrue(1==1);
		assertFalse(false);
		assertNull(null);
		assertNotNull(new Object());
		assertArrayEquals(new int[] {1}, new int[] {1});
	}
}
