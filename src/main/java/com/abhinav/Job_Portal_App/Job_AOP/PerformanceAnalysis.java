package com.abhinav.Job_Portal_App.Job_AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAnalysis {
    @Around("execution(* com.abhinav.Job_Portal_App.Job_Service.JobService.delete_job(..))")
    public Object performance(ProceedingJoinPoint jp) throws Throwable {
        long startTime = System.currentTimeMillis() ;
        Object obj = jp.proceed() ;
        long endTime = System.currentTimeMillis() ;
        System.out.println("Total time taken : " + (endTime - startTime) + " milliseconds");
        return obj ;
    }
}
