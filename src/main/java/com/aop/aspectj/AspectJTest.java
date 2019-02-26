package com.aop.aspectj;





import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/aop/aspectj/applicationContext.xml")
public class AspectJTest {

    @Resource(name = "myDaoImpl")
    private MyDaoImpl myDao;

    @Test
    public void spectTest(){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:com/aop/aspectj/applicationContext.xml");
//        MyDaoImpl myDaoImpl = (MyDaoImpl) applicationContext.getBean("myDaoImpl");
//        myDaoImpl.save();
        myDao.save();
    }
}
