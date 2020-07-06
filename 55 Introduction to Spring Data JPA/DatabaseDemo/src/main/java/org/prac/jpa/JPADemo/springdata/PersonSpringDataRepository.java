package org.prac.jpa.JPADemo.springdata;

import org.prac.jpa.JPADemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
