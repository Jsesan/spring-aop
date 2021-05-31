package com.kinandcarta.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;

@Configuration
@Aspect
public class UserAccessAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("com.kinandcarta.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void before(JoinPoint joinPoint){
        logger.info("Check for user access");
        logger.info("Allowed for execution for - {}", joinPoint);
    }
}
