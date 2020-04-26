package org.prac.spring.MockitoPrac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneBusinessTest {

	@Test
	void testGreatestFromAllData() {
		OneBusinessImpl  oneBusinessImpl=new OneBusinessImpl(new DataServiceStub());
		assertEquals(oneBusinessImpl.findGreatestFromAllData(),34);
	}

}
class DataServiceStub implements DataService{
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {10,34,1};
	}
	
}