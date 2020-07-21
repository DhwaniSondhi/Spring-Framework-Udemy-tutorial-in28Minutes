package org.prac.mins.SpringAOP.business;

import org.prac.mins.SpringAOP.data.Data1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

	@Autowired
	private Data1 dao;

	public String calculateSomething() {
		return dao.retrieveSomething();
	}
}
