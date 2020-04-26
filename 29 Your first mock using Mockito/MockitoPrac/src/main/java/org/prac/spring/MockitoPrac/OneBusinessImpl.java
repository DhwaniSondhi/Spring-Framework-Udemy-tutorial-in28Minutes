package org.prac.spring.MockitoPrac;

import java.util.Arrays;

public class OneBusinessImpl {
	private DataService dataService;
	
	
	
	public OneBusinessImpl(DataService dataService) {
		super();
		this.dataService=dataService;
	}



	int findGreatestFromAllData() {
		int[] data=dataService.retrieveAllData();
		return Arrays.stream(data).max().getAsInt();
	}
}

