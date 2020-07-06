package org.prac.jpa.JPADemo.jdbc;

import java.sql.Timestamp;
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
	public Person findByID(int id){
		return jdbcTemplate.queryForObject(
				"Select * from person where id=?", 
				new Object[] {id}, 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	public int deletByID(int id){
		return jdbcTemplate.update("Delete from person where id=?", new Object[] {id});
	}
		
	public int insert(Person person){
		return jdbcTemplate.update(
				"Insert into person (id, name,location, birth_date) Values (?,?,?,?)", 
				new Object[] {person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime())}
				);
	}
	public int update(Person person){
		return jdbcTemplate.update(
				"Update person set name=?, location=?, birth_date=? where id=?", 
				new Object[] {person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()}
				);
	}
}
