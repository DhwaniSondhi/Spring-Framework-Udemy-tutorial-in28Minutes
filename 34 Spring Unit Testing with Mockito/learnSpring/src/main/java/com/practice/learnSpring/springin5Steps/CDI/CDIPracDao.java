package com.practice.learnSpring.springin5Steps.CDI;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class CDIPracDao {

	public CDIPracDao() {}

	public int[] getData() {
		return new int[] {5, 89, 100};
	}
}
