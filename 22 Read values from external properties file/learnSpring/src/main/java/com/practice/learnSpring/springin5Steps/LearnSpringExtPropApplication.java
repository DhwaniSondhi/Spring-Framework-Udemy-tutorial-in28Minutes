package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.practice.learnSpring.componentScan.ComponentDAO;
import com.practice.learnSpring.springin5Steps.basics.BinarySearchImpl;
import com.practice.learnSpring.springin5Steps.properties.SomeExternalService;
import com.practice.learnSpring.springin5Steps.scope.PersonDAO;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class LearnSpringExtPropApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringExtPropApplication.class); 
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringExtPropApplication.class)){
			SomeExternalService serv=(SomeExternalService)context.getBean(SomeExternalService.class);
			LOGGER.info("{}",serv.returnServiceUrl());
			
		}
	}

}
