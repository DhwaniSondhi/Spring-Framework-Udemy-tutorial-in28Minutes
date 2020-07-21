package org.prac.mins.SpringAOP.business;

import org.prac.mins.SpringAOP.data.Data2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

	@Autowired
	private Data2 dao;

	public String calculateSomething() {
		return dao.retrieveSomething();
	}
}
