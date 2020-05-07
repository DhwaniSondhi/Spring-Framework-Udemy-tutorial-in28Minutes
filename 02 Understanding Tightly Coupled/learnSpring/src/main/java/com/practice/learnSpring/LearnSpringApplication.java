package com.practice.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		BinarySearchImpl bs=new BinarySearchImpl();
		int res=bs.binarySearch(new int[] {12, 3, 4, 5}, 5);
		System.out.print(res);
		SpringApplication.run(LearnSpringApplication.class, args);
	}

}
