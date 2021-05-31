package com.kinandcarta.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.kinandcarta.springaop.business.*.*(..))")
    public void businessLayerExecution(){}

//    @Pointcut("execution(* com.kinandcarta.springaop.data.*.*(..))")
//    public void dataLayerExecution(){}
//
//    @Pointcut("com.kinandcarta.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() " +
//            "&& com.kinandcarta.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
//    public void allLayersExecutions(){}

    @Pointcut("bean(Dao*)")
    public  void beanStartingDao(){}

    @Pointcut("bean(*Dao*)")
    public  void beanContainingDao(){}

    @Pointcut("within(com.kinandcarta.springaop.data..*)")
    public void dataLayerExecutionWithWithin(){}

    @Pointcut("@annotation(com.kinandcarta.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
