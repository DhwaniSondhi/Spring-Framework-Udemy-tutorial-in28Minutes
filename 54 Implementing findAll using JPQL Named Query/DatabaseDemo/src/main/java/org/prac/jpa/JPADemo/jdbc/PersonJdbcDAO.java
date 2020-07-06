package org.prac.jpa.JPADemo.jdbc;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.prac.jpa.JPADemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Person.PersonBuilder()
								.setId(rs.getInt("id"))
								.setName(rs.getString("name"))
								.setLocation(rs.getString("location"))
								.setBirthDate(new Date(rs.getTimestamp("birth_date").getTime()))
								.build();
		}
		
	}

	public List<Person> findAll(){
		return jdbcTemplate.query("Select * from person", 
				new PersonRowMapper()); 
	}
	public Person findByID(int id){
		return jdbcTemplate.queryForObject(
				"Select * from person where id=?", 
				new Object[] {id}, 
				new PersonRowMapper());
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
