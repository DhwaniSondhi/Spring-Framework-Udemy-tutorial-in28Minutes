package com.practice.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LearnSpringApplication.class, args);
		BinarySearchImpl bs1=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		BinarySearchImpl bs2=(BinarySearchImpl)context.getBean(BinarySearchImpl.class);
		System.out.println(bs1==bs2);
		int res=bs1.binarySearch(new int[] {12, 3, 4, 5}, 5);
		System.out.print(res);
		
	}

}
