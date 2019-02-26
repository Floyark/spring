package com.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyUtils {
    public static MyJDKProxy getMyJDKProxy(final MyJDKProxy myJDKProxy){
        MyJDKProxy myProxy = (MyJDKProxy) Proxy.newProxyInstance(myJDKProxy.getClass().getClassLoader(), myJDKProxy.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //String methodName = method.getName();
                System.out.println("代理方法开始-----------");
                //System.out.println("methodName:"+methodName);
                //method.invoke(myJDKProxy,args);
                return method.invoke(myJDKProxy,args);
            }
        });
        return myProxy;
    }
}
