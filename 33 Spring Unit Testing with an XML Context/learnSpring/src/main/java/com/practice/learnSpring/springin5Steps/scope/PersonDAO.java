package com.practice.learnSpring.springin5Steps.scope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

	@Autowired
	
	JdbcConnection jdbcconnect;

	public JdbcConnection getJdbcconnect() {
		return jdbcconnect;
	}

	public void setJdbcconnect(JdbcConnection jdbcconnect) {
		this.jdbcconnect = jdbcconnect;
	}
	
}
