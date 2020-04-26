package org.prac.spring.MockitoPrac;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OneBusinessMockTest {

	@Test
	void testGreatestFromAllData() {
		DataService mockDataService=Mockito.mock(DataService.class);
		when(mockDataService.retrieveAllData()).thenReturn(new int[] {10,34,1});
		OneBusinessImpl  oneBusinessImpl=new OneBusinessImpl(mockDataService);
		assertEquals(oneBusinessImpl.findGreatestFromAllData(),34);
	}

}
