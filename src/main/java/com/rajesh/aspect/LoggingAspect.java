package com.rajesh.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.rajesh.service.AccountServiceImp.*(..))")
    public void beforeLogging() {
        System.out.println("LoggingAspect - Before method execution.");
    }

    @AfterReturning("execution(* com.rajesh.service.AccountServiceImp.*(..))")
    public void afterReturningLogging() {
        System.out.println("LoggingAspect - After method returned successfully.");
    }

    @AfterThrowing("execution(* com.rajesh.service.AccountServiceImp.*(..))")
    public void afterThrowingLogging() {
        System.out.println("LoggingAspect - Exception occurred during method execution.");
    }

    @After("execution(* com.rajesh.service.AccountServiceImp.*(..))")
    public void afterLogging() {
        System.out.println("LoggingAspect - After method execution (finally block).");
    }
}
