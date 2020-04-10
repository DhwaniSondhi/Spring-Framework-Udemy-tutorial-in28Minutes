package com.practice.learnSpring;

public class BinarySearchImpl {
	
	private SortAlgo sortAlgo;
	
	public int binarySearch(int[] numbers, int searchNum) {
		int[] sorted=sortAlgo.sort(numbers);
		return 3;
	}
	public SortAlgo getSortAlgo() {
		return sortAlgo;
	}
	public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	
}
