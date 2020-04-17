package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.learnSpring.springin5Steps.scope.PersonDAO;

@SpringBootApplication
public class LearnSpringScopeApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringScopeApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringScopeApplication.class, args);
		ApplicationContext context1=SpringApplication.run(LearnSpringScopeApplication.class, args);
		PersonDAO psDao=(PersonDAO)context.getBean(PersonDAO.class);
		PersonDAO psDaoNew=(PersonDAO)context1.getBean(PersonDAO.class);
		LOGGER.info("{}", psDao);
		//LOGGER.info("{}", psDao.getJdbcconnect());
		//LOGGER.info("{}", psDao.getJdbcconnect());
		
		LOGGER.info("{}", psDaoNew);
		//LOGGER.info("{}", psDaoNew.getJdbcconnect());
		
	}

}
