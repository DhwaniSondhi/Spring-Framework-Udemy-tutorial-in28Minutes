package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.learnSpring.springin5Steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class LearnSpringScopeApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringScopeApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringScopeApplication.class);
		ApplicationContext context1=new AnnotationConfigApplicationContext(LearnSpringScopeApplication.class);
		PersonDAO psDao=(PersonDAO)context.getBean(PersonDAO.class);
		PersonDAO psDaoNew=(PersonDAO)context1.getBean(PersonDAO.class);
		LOGGER.info("{}", psDao);
		//LOGGER.info("{}", psDao.getJdbcconnect());
		//LOGGER.info("{}", psDao.getJdbcconnect());
		
		LOGGER.info("{}", psDaoNew);
		//LOGGER.info("{}", psDaoNew.getJdbcconnect());
		
	}

}
