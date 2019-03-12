package com.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyReflect {

    @Test
    public void testOne() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class classb=Class.forName("com.reflect.B");
//        Constructor constructor = classb.getConstructor();
//        Object obj1=constructor.newInstance();

//        Constructor constructor1=classb.getConstructor(int.class);
//        Object obj2=constructor1.newInstance(13);
//        Method method=classb.getMethod("fun1", int.class);
//        System.out.println(method.invoke(obj2,14));
//
//        Constructor constructor2=classb.getConstructor(int.class,int.class,int.class);
//        Object obj3=constructor2.newInstance(13,18,27);

        //利用反射创建对象
        // 1 class对象的newInstance方法
        Class classb=Class.forName("com.reflect.B");
        B o1 = (B)classb.newInstance();
        System.out.println(o1.fun1(8));

        //2 利用有参构造函数获取对象
        Constructor constructor=classb.getConstructor(int.class);
        B o2 = (B)constructor.newInstance(11);

        //3 利用无参构造函数获取对象
        Constructor constructor1=classb.getConstructor();
        B b = (B) constructor1.newInstance();
    }
}
