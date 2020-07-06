package org.prac.jpa.JPADemo;

import java.sql.Date;

import org.prac.jpa.JPADemo.entity.Person;
import org.prac.jpa.JPADemo.jpa.PersonJPARepository;
import org.prac.jpa.JPADemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataDatabaseDemoApplication implements CommandLineRunner {
	
	@Autowired
	private PersonSpringDataRepository personSpringData;
	private Logger LOGGER=LoggerFactory.getLogger(SpringDataDatabaseDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//LOGGER.info("Person Data: {}", personDao.findAll());
		LOGGER.info("Person Data: {}", personSpringData.findById(1001));
		LOGGER.info("Insert Data: {}", personSpringData.save(new Person.PersonBuilder()
															.setName("Aria")
															.setLocation("Berlin")
															.setBirthDate(new Date(1993,12,5))
															.build()));
		LOGGER.info("Update Data: {}", personSpringData.save(new Person.PersonBuilder()
															.setId(1)
															.setName("Judi")
															.setLocation("New York")
															.setBirthDate(new Date(1993,12,5))
															.build()));
		
		LOGGER.info("Person Data: {}", personSpringData.findAll());
	}

}
