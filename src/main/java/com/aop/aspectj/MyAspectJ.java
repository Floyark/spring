package com.aop.aspectj;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class MyAspectJ {
    public void log(){
        System.out.println("log ---- ");
    }
}
