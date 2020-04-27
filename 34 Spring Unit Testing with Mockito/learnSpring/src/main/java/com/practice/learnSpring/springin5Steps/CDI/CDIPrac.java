package com.practice.learnSpring.springin5Steps.CDI;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class CDIPrac {

	@Inject
	private CDIPracDao cdiDao;

	public CDIPracDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CDIPracDao cdiDao) {
		this.cdiDao = cdiDao;
	}
	
	public int findGreatest() {
		int[] data=cdiDao.getData();
		if(data.length==0) {
			return Integer.MIN_VALUE;
		}
		return Arrays.stream(data).max().getAsInt();
	}
	
}
