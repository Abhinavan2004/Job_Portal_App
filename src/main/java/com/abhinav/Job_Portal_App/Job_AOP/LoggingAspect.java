package com.abhinav.Job_Portal_App.Job_AOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.abhinav.Job_Portal_App.Job_Service.JobService.delete_job(..))")
    public void methodcall(JoinPoint jp){
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

    @After("execution(* com.abhinav.Job_Portal_App.Job_Service.JobService.delete_job(..))")
    public void methodexec(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.abhinav.Job_Portal_App.Job_Service.JobService.delete_job(..))")
    public void methodreturn(JoinPoint jp){
        LOGGER.info("Method Successfully completed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.abhinav.Job_Portal_App.Job_Service.JobService.delete_job(..))")
    public void methoderror(JoinPoint jp){
        LOGGER.info("Method Throws some error " + jp.getSignature().getName());
    }
}
