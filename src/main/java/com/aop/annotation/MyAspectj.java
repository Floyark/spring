package com.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.Test;

@Aspect
public class MyAspectj {
    //execution(* void com.aop.annotation.MyDaoImpl.save())
    @Before(value = "execution(* com.aop.annotation.MyDaoImpl.save())")
    public void before(){
        System.out.println("before方法");
    }

    @After(value ="execution(* com.aop.annotation.MyDaoImpl.save())")
    public void after(){
        System.out.println("after方法");
    }

    @AfterReturning(value ="execution(* com.aop.annotation.MyDaoImpl.save())" )
    public void afterReturning(){
        System.out.println("afterReturning方法");
    }

    @AfterThrowing(value = "execution(* com.aop.annotation.MyDaoImpl.save())")
    public void atferThrowing(){
        System.out.println("atferThrowing方法");
    }


    //引入poincut
    @Around(value = "MyAspectj.fn()")
    public void around(JoinPoint joinPoint){
        System.out.println("Around方法一");
        System.out.println("");
    }


    //自己设置poincut
    @Pointcut(value = "execution(* com.aop.annotation.MyDaoImpl.save())")
    public void fn() {

    }
}
