package com.spring.junit;

public class MathPracTest {

	int sum(int[] numbers) {
		int sum=0;
		for(int loop:numbers) {
			sum+=loop;
		}
		return sum;
	}
}
