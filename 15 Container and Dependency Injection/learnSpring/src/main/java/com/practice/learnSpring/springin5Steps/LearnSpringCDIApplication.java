package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.learnSpring.springin5Steps.CDI.CDIPrac;
import com.practice.learnSpring.springin5Steps.scope.PersonDAO;

@SpringBootApplication
public class LearnSpringCDIApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringCDIApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringCDIApplication.class, args);
		CDIPrac cdiDao=(CDIPrac)context.getBean(CDIPrac.class);
		LOGGER.info("{}", cdiDao);
		
	}

}
