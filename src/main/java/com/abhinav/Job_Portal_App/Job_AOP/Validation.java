package com.abhinav.Job_Portal_App.Job_AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Validation {
    private static final Logger LOGGER = LoggerFactory.getLogger(Validation.class);

    @Around("execution(* com.abhinav.Job_Portal_App.Job_Service.JobService._job(..)) && args(postId)")
    public Object performance(ProceedingJoinPoint jp , int postId) throws Throwable {

        if (postId < 0) {
            LOGGER.info("Post ID is negative, updating it.");

            postId = -postId;
            LOGGER.info("New Value: " + postId);
        }
        Object obj = jp.proceed(new Object[]{postId});
        return obj ;
    }
}
