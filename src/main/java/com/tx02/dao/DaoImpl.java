package com.tx02.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DaoImpl extends JdbcDaoSupport implements Dao {

    public DaoImpl(){
        System.out.println("DaoImpl chushihua");
    }

    @Override
    public void putMoney(String out, double Money) {
        System.out.println("put");
        String sql="UPDATE Acount SET money=money - ? WHERE name = ?";
        this.getJdbcTemplate().update(sql,Money,out);
    }

    @Override
    public void inMoney(String in, double Money) {
        System.out.println("in");
        String sql="UPDATE Acount SET money=money+? WHERE NAME = ?";
        this.getJdbcTemplate().update(sql,Money,in);
    }
}
