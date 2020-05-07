package org.prac.spring.SpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	private static Logger LOGGER=(Logger) LoggerFactory.getLogger(SpringBootAppApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext= SpringApplication.run(SpringBootAppApplication.class, args);
	
		for (String beanName : appContext.getBeanDefinitionNames()) {
			LOGGER.info("{}",beanName);
		}
	}

}
