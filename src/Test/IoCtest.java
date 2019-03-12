import com.aop.aspectj.MyDao;
import com.aop.aspectj.MyDaoImpl;
import com.aop.cglib.myCGLIB;
import com.aop.cglib.myCGLIBImpl;
import com.aop.cglib.myCGLIBUtils;
import com.aop.jdk.MyJDKProxy;
import com.aop.jdk.MyJDKProxyImpl;
import com.aop.jdk.MyProxyUtils;
import com.bean.*;
import com.service.MyService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IoCtest {


    static Logger logger=Logger.getLogger(IoCtest.class);
    //IoC
    @Test
    public void testOne(){
        logger.error(this.getClass());
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService myService = (MyService)applicationContext.getBean("myServImpl");
        myService.serviceOne();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

    @Test
    public void testTwo(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBean myBean = (MyBean)applicationContext.getBean("myBean");
        System.out.println(myBean.toString());
    }

    @Test
    public void testThree(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanArray beanArray=(BeanArray)applicationContext.getBean("beanArray");
        System.out.println(beanArray.toString());
    }

    @Test
    public void testFour(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanList beanList = (BeanList) applicationContext.getBean("beanList");
        System.out.println(beanList.toString());
    }

    @Test
    public void testFive(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanMap beanMap= (BeanMap) applicationContext.getBean("beanMap");
        System.out.println(beanMap.toString());
    }

    @Test
    public void testSix(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanProperties beanProperties= (BeanProperties) applicationContext.getBean("beanProperties");
        System.out.println(beanProperties.toString());
    }

    @Test
    public void testSeven(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanMap map= (BeanMap) applicationContext.getBean("beanMap");
        System.out.println(map.toString());
    }


    //JDK Proxy aop
    @Test
    public void testEight(){
        MyJDKProxy myJDKProxy=new MyJDKProxyImpl();
//        myJDKProxy.save();
//        myJDKProxy.update();
//        System.out.println("-----------------");
        MyJDKProxy myProxy = MyProxyUtils.getMyJDKProxy(myJDKProxy);
        myProxy.save();
    }

    @Test
    public void testNine(){
        myCGLIB myCGLIB=new myCGLIBImpl();
        myCGLIB.save();
        myCGLIB.update();
        System.out.println("--------------------");
        myCGLIBImpl myProxy = myCGLIBUtils.getProxy();
        myProxy.save();
        myProxy.update();
    }


    @Test
    public void testTen(){
        List<String> list=new ArrayList<String>();

        List<String> synlist= Collections.synchronizedList(list);



    }
}
