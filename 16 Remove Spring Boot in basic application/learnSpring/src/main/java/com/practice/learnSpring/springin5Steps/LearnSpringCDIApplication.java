package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.learnSpring.springin5Steps.CDI.CDIPrac;

@Configuration
@ComponentScan
public class LearnSpringCDIApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringCDIApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringCDIApplication.class);
		CDIPrac cdiDao=(CDIPrac)context.getBean(CDIPrac.class);
		LOGGER.info("{}", cdiDao);
		
	}

}
