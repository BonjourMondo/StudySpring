package com.lee.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
public class Audience {
    @Pointcut("execution(* com.lee.concert.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("请电话静音");
            System.out.println("请坐");
            jp.proceed();
            System.out.println("热烈鼓掌");
        } catch (Throwable throwable) {
            System.out.println("演砸了");
        }
    }
}
