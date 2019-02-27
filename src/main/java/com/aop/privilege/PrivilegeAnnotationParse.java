package com.aop.privilege;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.jsp.PageContext;
import java.lang.reflect.Method;

public class PrivilegeAnnotationParse {

    public static String parse(Class targetClass,String methodName){

//        Logger logger=Logger.getLogger(PrivilegeAnnotationParse.class);
//        logger.debug("methodName:"+methodName);
//        logger.debug("targetClass:"+targetClass);
        System.out.println("methodName:"+methodName);
        System.out.println("targetClass:"+targetClass);

        Method method;
        PrivilegeInfo methodAnnotation;
        String methodAccess= "";

        try {
            method=targetClass.getMethod(methodName);
            if(method.isAnnotationPresent(PrivilegeInfo.class)){
                methodAnnotation = method.getAnnotation(PrivilegeInfo.class);
                methodAccess=methodAnnotation.value();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return methodAccess;
    }
}
