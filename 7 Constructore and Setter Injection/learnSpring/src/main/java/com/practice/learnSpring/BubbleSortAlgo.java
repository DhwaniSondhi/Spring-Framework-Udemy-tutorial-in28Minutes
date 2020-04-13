package com.practice.learnSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgo implements SortAlgo{

	public int[] sort(int[] numbers) {
		return numbers;
	}
}
