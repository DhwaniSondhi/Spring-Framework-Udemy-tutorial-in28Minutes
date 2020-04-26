package com.spring.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MathPracTest {

	MathPrac mprac=new MathPrac();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Test
	public void sumTest1() {
		
		int result=mprac.sum(new int[] {1,2,3});
		assertEquals(result, 6);
		System.out.println("In method 1");
	}
	
	@Test
	public void sumTest2() {
		int result=mprac.sum(new int[] {1});
		assertEquals(result, 1);
		System.out.println("In method 2");
	}
}
