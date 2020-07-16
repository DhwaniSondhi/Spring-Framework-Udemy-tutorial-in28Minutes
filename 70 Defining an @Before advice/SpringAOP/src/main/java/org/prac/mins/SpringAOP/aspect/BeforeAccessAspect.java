package org.prac.mins.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAccessAspect {

	private Logger LOGGER = LoggerFactory.getLogger(BeforeAccessAspect.class);

	@Before("execution(* *.calculateSomething(..))")
	public void before(JoinPoint jp) {
		LOGGER.info("Hey, this is implemented before the method. {}", jp);
	}
}
