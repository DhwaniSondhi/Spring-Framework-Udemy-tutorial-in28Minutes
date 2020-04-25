package com.spring.junit;

import org.junit.Test;

import junit.framework.Assert;

public class MathPracTest {

	MathPrac mprac=new MathPrac();
	@Test
	public void sumTest1() {
		
		int result=mprac.sum(new int[] {1,2,3});
		Assert.assertEquals(result, 6);
	}
	
	@Test
	public void sumTest2() {
		int result=mprac.sum(new int[] {1});
		Assert.assertEquals(result, 1);
	}
}
