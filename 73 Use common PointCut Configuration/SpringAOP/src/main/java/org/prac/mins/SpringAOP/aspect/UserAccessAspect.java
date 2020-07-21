package org.prac.mins.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAspect {

	private Logger LOGGER = LoggerFactory.getLogger(UserAccessAspect.class);

	@Pointcut("execution(* *.calculateSomething(..))")
	public void dataLayerExec() {
	}

	@Before("dataLayerExec()")
	public void before(JoinPoint jp) {
		LOGGER.info("Hey, this is implemented before the method. {}", jp);
	}

	@After(value = "dataLayerExec()")
	public void after(JoinPoint jp) {
		LOGGER.info("After execution of {}", jp);
	}

	@AfterReturning(value = "dataLayerExec()", returning = "result")
	public void afterReturning(JoinPoint jp, Object result) {
		LOGGER.info("{} returning value {}", jp, result);
	}

	@AfterThrowing(value = "dataLayerExec()", throwing = "exp")
	public void afterThrowing(JoinPoint jp, Object exp) {
		LOGGER.info("{} throwing value {}", jp, exp);
	}

	@Around(value = "dataLayerExec()")
	public void around(ProceedingJoinPoint jp) throws Throwable {
		long start = System.currentTimeMillis();
		jp.proceed();
		long end = System.currentTimeMillis();
		LOGGER.info("Time taken: {}", (end - start));
	}
}
