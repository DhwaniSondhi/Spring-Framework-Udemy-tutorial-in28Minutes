package com.practice.learnSpring.basic;

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
