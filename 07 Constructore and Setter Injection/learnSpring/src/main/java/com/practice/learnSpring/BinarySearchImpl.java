package com.practice.learnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgo sortAlgo;

	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}

	public int binarySearch(int[] numbers, int searchNum) {
		return 3;
	}
	public SortAlgo getSortAlgo() {
		return sortAlgo;
	}
	/*public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}*/

}
