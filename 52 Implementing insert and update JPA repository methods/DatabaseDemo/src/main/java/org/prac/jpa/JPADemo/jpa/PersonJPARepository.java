package org.prac.jpa.JPADemo.jpa;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.prac.jpa.JPADemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonJPARepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id); 
	}
	public Person insert(Person person){
		return entityManager.merge(person);
	}
	public Person update(Person person){
		return entityManager.merge(person);
	}
}
