package com.practice.learnSpring.springin5Steps.CDI;

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
	
	
}
