package com.aop.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/aop/annotation/applicationContext.xml")
public class AnnoTest {

    @Resource(name ="myDao" )
    MyDao myDao;
    @Test
    public void one(){
        myDao.save();
    }
}
