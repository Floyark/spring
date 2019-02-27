package com.tx02;

import com.tx02.service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/tx02/applicationContext.xml")


//声明式配置
public class txTest {

    @Resource(name="service")
    Service service;
    @Test
    public void testOne(){
//        ApplicationContext ac=new ClassPathXmlApplicationContext("com/tx01/applicationContext.xml");
//        Service service = (Service) ac.getBean("service");
//        Service service=new ServiceImpl();
      String name1="xiaohua";
      String name2="hanmeimei";
      double money=12.36;
      service.pay(name1,name2,money);
    }


}
