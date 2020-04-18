package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.learnSpring.componentScan.ComponentDAO;
import com.practice.learnSpring.springin5Steps.basics.BinarySearchImpl;
import com.practice.learnSpring.springin5Steps.scope.PersonDAO;
import com.practice.learnSpring.springin5Steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class LearnSpringXmlContextApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringXmlContextApplication.class); 
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml")){
			XmlPersonDAO psDao=context.getBean(XmlPersonDAO.class); 
			System.out.println(psDao);
			System.out.println(psDao.getXmlJdbcconnect());
		}
	}

}
