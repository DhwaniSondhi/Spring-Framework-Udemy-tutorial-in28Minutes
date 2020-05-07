package com.practice.learnSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgo{

	public int[] sort(int[] numbers) {
		System.out.println("QuickSortAlgo");
		return numbers;
	}
}
