package com.practice.learnSpring.springin5Steps.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger LOGGER=LoggerFactory.getLogger(BinarySearchImpl.class);
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;


	public int binarySearch(int[] numbers, int searchNum) {
		sortAlgo.sort(numbers);
		return 3;
	}
	public SortAlgo getSortAlgo() {
		return sortAlgo;
	}
	public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy");
	}

}
