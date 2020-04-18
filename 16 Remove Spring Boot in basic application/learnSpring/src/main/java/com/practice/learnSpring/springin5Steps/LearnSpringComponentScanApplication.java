package com.practice.learnSpring.springin5Steps;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.learnSpring.componentScan.ComponentDAO;

@Configuration
@ComponentScan("com.practice.learnSpring.componentScan")
public class LearnSpringComponentScanApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringComponentScanApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringComponentScanApplication.class);
		ComponentDAO psDao=(ComponentDAO)context.getBean(ComponentDAO.class);
		LOGGER.info("{}", psDao);
		
	}
	

}
