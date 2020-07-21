package org.prac.mins.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAspect {

	private Logger LOGGER = LoggerFactory.getLogger(UserAccessAspect.class);

	@Before("execution(* *.calculateSomething(..))")
	public void before(JoinPoint jp) {
		LOGGER.info("Hey, this is implemented before the method. {}", jp);
	}

	@After(value = "execution(* *.calculateSomething(..))")
	public void after(JoinPoint jp) {
		LOGGER.info("After execution of {}", jp);
	}

	@AfterReturning(value = "execution(* *.calculateSomething(..))", returning = "result")
	public void afterReturning(JoinPoint jp, Object result) {
		LOGGER.info("{} returning value {}", jp, result);
	}

	@AfterThrowing(value = "execution(* *.calculateSomething(..))", throwing = "exp")
	public void afterThrowing(JoinPoint jp, Object exp) {
		LOGGER.info("{} throwing value {}", jp, exp);
	}
}
