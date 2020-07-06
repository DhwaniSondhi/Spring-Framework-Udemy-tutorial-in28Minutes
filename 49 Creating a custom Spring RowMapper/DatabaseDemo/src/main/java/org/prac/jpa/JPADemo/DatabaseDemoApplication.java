package org.prac.jpa.JPADemo;

import java.sql.Date;

import org.prac.jpa.JPADemo.entity.Person;
import org.prac.jpa.JPADemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	
	@Autowired
	private PersonJdbcDAO personDao;
	private Logger LOGGER=LoggerFactory.getLogger(DatabaseDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOGGER.info("Person Data: {}", personDao.findAll());
		LOGGER.info("Person Data: {}", personDao.findByID(1001));
	}

}
