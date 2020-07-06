package org.prac.jpa.JPADemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.prac.jpa.JPADemo.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonJPARepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll(){
		TypedQuery<Person> typedQuery= entityManager.createNamedQuery("find_all_persons",Person.class);
		return 	typedQuery.getResultList();
	}
	public Person findById(int id){
		return entityManager.find(Person.class, id); 
	}
	public Person insert(Person person){
		return entityManager.merge(person);
	}
	public Person update(Person person){
		return entityManager.merge(person);
	}
	public void deleteById(int id){
		entityManager.remove(findById(id));
	}
}
