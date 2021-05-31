package com.kinandcarta.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAopAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "com.kinandcarta.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
    returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "com.kinandcarta.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
    throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("{} returned with value {}", joinPoint, exception);
    }

    @After(value = "com.kinandcarta.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint){
        logger.info("after execution of {}", joinPoint);
    }
}
