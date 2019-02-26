package com.tx.service;

import com.tx.dao.Dao;

public class ServiceImpl implements Service {

    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }
    public ServiceImpl(){
        System.out.println("ServiceImpl chushihua");
    }


    @Override
    public void pay(String out, String in, double money) {
        System.out.println("pay");
        dao.putMoney(out,money);
        dao.inMoney(in,money);
    }
}
