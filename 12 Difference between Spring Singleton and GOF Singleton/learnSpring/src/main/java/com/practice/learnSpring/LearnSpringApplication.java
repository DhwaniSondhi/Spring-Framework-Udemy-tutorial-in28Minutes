package com.practice.learnSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.learnSpring.basic.BinarySearchImpl;
import com.practice.learnSpring.scope.PersonDAO;

@SpringBootApplication
public class LearnSpringApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringApplication.class, args);
		ApplicationContext context1=SpringApplication.run(LearnSpringApplication.class, args);
		/*BinarySearchImpl bs1=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		BinarySearchImpl bs2=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		System.out.println(bs1==bs2);
		int res=bs1.binarySearch(new int[] {12, 3, 4, 5}, 5);*/
		PersonDAO psDao=(PersonDAO)context.getBean(PersonDAO.class);
		PersonDAO psDaoNew=(PersonDAO)context1.getBean(PersonDAO.class);
		LOGGER.info("{}", psDao);
		//LOGGER.info("{}", psDao.getJdbcconnect());
		//LOGGER.info("{}", psDao.getJdbcconnect());
		
		LOGGER.info("{}", psDaoNew);
		//LOGGER.info("{}", psDaoNew.getJdbcconnect());
		
	}

}
