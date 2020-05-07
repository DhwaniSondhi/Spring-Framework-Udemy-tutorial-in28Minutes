package com.practice.learnSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo{

	public int[] sort(int[] numbers) {
		System.out.println("BubbleSortAlgo");
		return numbers;
	}
}
