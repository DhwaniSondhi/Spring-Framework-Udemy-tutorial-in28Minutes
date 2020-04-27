package com.practice.learnSpring.springin5Steps.CDI;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CDITest {

	@Mock
	CDIPracDao dao;
	
	@InjectMocks
	CDIPrac cdiservice;
	
	@Test
	public void testCDI() {
		when(dao.getData()).thenReturn(new int[] {10,36,9}).thenReturn(new int[] {}).thenReturn(new int[] {9,9});
		assertEquals(36, cdiservice.findGreatest());
		assertEquals(Integer.MIN_VALUE, cdiservice.findGreatest());
		assertEquals(9, cdiservice.findGreatest());
	}
}
