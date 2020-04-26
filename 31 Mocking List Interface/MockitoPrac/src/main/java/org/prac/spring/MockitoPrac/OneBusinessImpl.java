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
		if(data.length==0) {
			return Integer.MIN_VALUE;
		}
		return Arrays.stream(data).max().getAsInt();
	}
}

