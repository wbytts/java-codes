package com.by.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 23:36
 */
@Aspect // 标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.by.service.UserServiceImpl3.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* com.by.service.UserServiceImpl3.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    @Around("execution(* com.by.service.UserServiceImpl3.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        // 执行方法
        Object proceed = pjp.proceed();
        System.out.println("环绕后");
    }

}
