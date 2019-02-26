package com.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.beans.Transient;

public class DaoImpl implements Dao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DaoImpl(){
        System.out.println("DaoImpl chushihua");
    }

    @Transient
    @Override
    public void putMoney(String out, double Money) {
        System.out.println("put");
        String sql="UPDATE Acount SET money=money - ? WHERE name = ?";
        jdbcTemplate.update(sql,Money,out);
    }

    @Override
    public void inMoney(String in, double Money) {
        System.out.println("in");
        String sql="UPDATE Acount SET money=money+? WHERE NAME = ?";
        jdbcTemplate.update(sql,Money,in);
    }
}
