package com.hg.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @auther kim
 * @date 2019/1/26
 */
//@Aspect
//@Component
public class TimeAspect {

    @Around("execution(* com.hg.web.controller.UserController.*(..))")
    public Object handlerAspectMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("time aspect start");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("arg is: " + arg);
        }
        Long date = new Date().getTime();
        Object object = joinPoint.proceed();
        System.out.println("time aspect use: " + (new Date().getTime() - date));
        System.out.println("time aspect end");
        return object;
    }
}
