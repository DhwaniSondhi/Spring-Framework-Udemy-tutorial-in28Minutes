package com.practice.learnSpring.springin5Steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.learnSpring.componentScan.ComponentDAO;
import com.practice.learnSpring.springin5Steps.basics.BinarySearchImpl;
import com.practice.learnSpring.springin5Steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class LearnSpringBasicApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(LearnSpringBasicApplication.class); 
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(LearnSpringBasicApplication.class);
		BinarySearchImpl bs1=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		BinarySearchImpl bs2=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		System.out.println(bs1==bs2);
		int res=bs1.binarySearch(new int[] {12, 3, 4, 5}, 5);
		System.out.print(res);
	}

}
