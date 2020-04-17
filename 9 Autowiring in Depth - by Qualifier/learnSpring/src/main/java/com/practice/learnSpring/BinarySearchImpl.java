package com.practice.learnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;


	public int binarySearch(int[] numbers, int searchNum) {
		sortAlgo.sort(numbers);
		return 3;
	}
	public SortAlgo getSortAlgo() {
		return sortAlgo;
	}
	public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}

}
