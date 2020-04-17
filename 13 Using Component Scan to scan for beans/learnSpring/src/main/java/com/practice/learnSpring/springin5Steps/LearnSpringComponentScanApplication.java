package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.practice.learnSpring.componentScan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.practice.learnSpring.componentScan")
public class LearnSpringComponentScanApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringComponentScanApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringComponentScanApplication.class, args);
		ComponentDAO psDao=(ComponentDAO)context.getBean(ComponentDAO.class);
		LOGGER.info("{}", psDao);
		
	}

}
