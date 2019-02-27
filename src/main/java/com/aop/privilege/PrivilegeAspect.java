package com.aop.privilege;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;
import java.util.List;

public class PrivilegeAspect {

   private List<FirmPrivilege> privileges;

   public void setPrivileges(List<FirmPrivilege> privileges) {
       this.privileges = privileges;
   }

    /*检查用户的权限和方法的权限是否匹配*/
    public void isAccess(ProceedingJoinPoint point){

        //获取该方法的类和方法名
        Class targetClass = point.getClass();
        String method=point.getSignature().getName();

        //得到该方法的访问权限
        String access= PrivilegeAnnotationParse.parse(targetClass,method);

        //遍历用户权限，查看相对应的权限
        Boolean isAccessed=false;

        //记录日志
//        PropertyConfigurator.configure("log4j.properties");
//        Logger logger=Logger.getLogger(PrivilegeAspect.class);

        for(FirmPrivilege privilege:privileges){

//            logger.debug("进入权限筛选");
            //如果方法上没有要限制的注解 则用户可以用
            if("".equals(access)){
//                logger.debug("权限为空，用户可用");
                System.out.println("权限为空，用户可用");
                isAccessed=true;
                break;
            }

            //方法上注解和用户匹配 则用户可以用
            if(privilege.getValue()!=null&&privilege.getValue().equalsIgnoreCase(access)){
//                logger.debug(""权限不匹配，用户不可用");
                System.out.println("权限不匹配，用户不可用");
                isAccessed=true;
                break;
            }

        }
        //如果用户有权限使用 则调用
        if(isAccessed){
            try {
                point.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }else {
//            logger.debug("权限不匹配，用户不可用");
            System.out.println("权限不匹配，用户不可用");
        }

    }
}
