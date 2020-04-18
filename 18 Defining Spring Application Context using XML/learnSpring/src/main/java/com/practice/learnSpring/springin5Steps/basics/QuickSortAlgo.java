package com.practice.learnSpring.springin5Steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo{

	public int[] sort(int[] numbers) {
		System.out.println("QuickSortAlgo");
		return numbers;
	}
}
