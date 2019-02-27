package com.aop.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class myCGLIBUtils {

    public static myCGLIBImpl getProxy(){
        Enhancer enhancer=new Enhancer();

        //设置父类
        enhancer.setSuperclass(myCGLIBImpl.class);

        //设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    System.out.println("ssssss");
                    return null;
                }
        });
        //生成代理对象
        return (myCGLIBImpl) enhancer.create();
    }
}
