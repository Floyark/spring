package com.tx.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public interface Dao {
    public void putMoney(String out,double Money);
    public void inMoney(String in,double Money);
}
