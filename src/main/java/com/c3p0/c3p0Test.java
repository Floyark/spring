package com.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.beans.PropertyVetoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/c3p0/applicationContext.xml")
public class c3p0Test {



    @Resource(name = "jdbcTemplate")
    JdbcTemplate jdbcTemplate;


    @Test
    public void testOne(){

//            ComboPooledDataSource pooledDataSource=new ComboPooledDataSource();
//            pooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//            pooledDataSource.setJdbcUrl("jdbc:mysql://47.95.251.104:3306/store");
//            pooledDataSource.setUser("root");
//            pooledDataSource.setPassword("123456");

            String sql="INSERT INTO `tb_store` VALUE(?,?,?)";
            int id=9;
            String name="xiaohua";
            String desc="haha";
            jdbcTemplate.update(sql,id,name,desc);
    }
}
