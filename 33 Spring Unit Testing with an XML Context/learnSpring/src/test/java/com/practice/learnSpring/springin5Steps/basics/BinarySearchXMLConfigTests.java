package com.practice.learnSpring.springin5Steps.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.practice.learnSpring.springin5Steps.LearnSpringBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class BinarySearchXMLConfigTests {


	@Autowired
	BinarySearchImpl search;

	@Test
	public void testBasicScenario() {

		int actualResult=search.binarySearch(new int[] {}, 5);
		assertEquals(3, actualResult);
	}

}
