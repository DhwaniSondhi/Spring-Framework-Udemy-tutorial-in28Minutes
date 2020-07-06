package org.prac.jpa.JPADemo;

import java.sql.Date;

import org.prac.jpa.JPADemo.entity.Person;
import org.prac.jpa.JPADemo.jpa.PersonJPARepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JPADatabaseDemoApplication implements CommandLineRunner {
	
	@Autowired
	private PersonJPARepository personJpa;
	private Logger LOGGER=LoggerFactory.getLogger(JPADatabaseDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JPADatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//LOGGER.info("Person Data: {}", personDao.findAll());
		LOGGER.info("Person Data: {}", personJpa.findById(1001));
		LOGGER.info("Insert Data: {}", personJpa.insert(new Person.PersonBuilder()
															.setName("Aria")
															.setLocation("Berlin")
															.setBirthDate(new Date(1993,12,5))
															.build()));
		LOGGER.info("Update Data: {}", personJpa.update(new Person.PersonBuilder()
															.setId(1)
															.setName("Judi")
															.setLocation("New York")
															.setBirthDate(new Date(1993,12,5))
															.build()));
		personJpa.deleteById(1001);
			
	}

}
