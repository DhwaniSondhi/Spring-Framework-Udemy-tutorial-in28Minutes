package org.prac.spring.MockitoPrac;

import java.util.Arrays;

public class OneBusinessInterface {
	private DataService dataService;
	
	int findGreatestFromAllData() {
		int[] data=dataService.retrieveAllData();
		return Arrays.stream(data).max().getAsInt();
	}
}

