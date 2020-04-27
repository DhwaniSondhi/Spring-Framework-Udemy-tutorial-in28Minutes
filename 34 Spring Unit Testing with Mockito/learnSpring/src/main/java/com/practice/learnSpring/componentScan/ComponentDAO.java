package com.practice.learnSpring.componentScan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

	@Autowired
	ComponentJdbcConnection jdbcconnect;

	public ComponentJdbcConnection getJdbcconnect() {
		return jdbcconnect;
	}

	public void setComponentJdbcconnect(ComponentJdbcConnection jdbcconnect) {
		this.jdbcconnect = jdbcconnect;
	}
	
}
