package com.tx;

import com.tx.service.Service;
import com.tx.service.ServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:com/tx/applicationContext.xml")
@EnableTransactionManagement
public class txTest {


    @Test
    public void testOne(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/tx/applicationContext.xml");
        Service service = (Service) ac.getBean("service");
//        Service service=new ServiceImpl();
      String name1="xiaohua";
      String name2="hanmeimei";
      double money=12.36;
        service.pay(name1,name2,money);
    }


}
