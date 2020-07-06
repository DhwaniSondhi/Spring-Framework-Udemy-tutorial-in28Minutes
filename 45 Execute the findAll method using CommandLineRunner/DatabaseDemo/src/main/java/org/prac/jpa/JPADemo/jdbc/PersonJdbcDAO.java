package org.prac.jpa.JPADemo.jdbc;

import java.util.List;

import org.prac.jpa.JPADemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll(){
		return jdbcTemplate.query("Select * from person", 
				new BeanPropertyRowMapper(Person.class)); 
	}
}
