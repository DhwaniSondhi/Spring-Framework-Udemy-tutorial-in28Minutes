package com.practice.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringApplication.class, args);
		BinarySearchImpl bs=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		int res=bs.binarySearch(new int[] {12, 3, 4, 5}, 5);
		System.out.print(res);
		
	}

}
