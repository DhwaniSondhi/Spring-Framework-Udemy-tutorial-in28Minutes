package org.prac.spring.MockitoPrac;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.platform.runner.JUnitPlatform;


@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class OneBusinessMockAnnotationsTest {

	@Mock
	DataService mockDataService;
	
	@InjectMocks
	OneBusinessImpl  oneBusinessImpl;
	
	@Test
	void testGreatestFromAllData_MultipleValues() {
		when(mockDataService.retrieveAllData()).thenReturn(new int[] {10,34,1});
		assertEquals(oneBusinessImpl.findGreatestFromAllData(),34);
	}
	
	@Test
	void testGreatestFromAllData_OneValues() {
		when(mockDataService.retrieveAllData()).thenReturn(new int[] {2});
		assertEquals(oneBusinessImpl.findGreatestFromAllData(),2);
	}
	
	@Test
	void testGreatestFromAllData_NoValues() {
		when(mockDataService.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(oneBusinessImpl.findGreatestFromAllData(),Integer.MIN_VALUE);
	}

}
