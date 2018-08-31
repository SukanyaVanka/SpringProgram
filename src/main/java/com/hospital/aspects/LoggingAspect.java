package com.hospital.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* com.hospital.controllers.RegistrationController.viewRegistration(..) )")
    public void before(JoinPoint joinPoint){
        System.out.println("before method:"+joinPoint.getSignature());

    }
    @After("execution(* com.hospital.controllers.*.*(..) )")
    public void after(JoinPoint joinPoint){
        System.out.println("before method:"+joinPoint.getSignature());

    }
}
