package com.practice.learnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgo bubbleSortAlgo;

	public BinarySearchImpl(SortAlgo bubbleSortAlgo) {
		super();
		this.bubbleSortAlgo = bubbleSortAlgo;
	}

	public int binarySearch(int[] numbers, int searchNum) {
		bubbleSortAlgo.sort(numbers);
		return 3;
	}
	public SortAlgo getSortAlgo() {
		return bubbleSortAlgo;
	}
	/*public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}*/

}
