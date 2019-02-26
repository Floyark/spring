package com.spring_jdbc_pool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/spring_jdbc_pool/applicationContext.xml")
public class JdbcTest {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testOne(){
        //手工配置
//        DriverManagerDataSource dataSource=new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://47.95.251.104:3306/store");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);

        //插入数据
//        String sql="INSERT INTO `tb_store` VALUE(?,?,?)";
//        int id=8;
//        String name="xiaohua";
//        String desc="haha";
//        jdbcTemplate.update(sql,id,name,desc);

        //查询数据
        String sqlQuery="SELECT * FROM tb_store";
        List<ItemBean> items=jdbcTemplate.query(sqlQuery,new BeanMapper());
        System.out.println(items);
    }
}
