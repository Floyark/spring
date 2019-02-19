package com.service;

import com.dao.MyDao;

public class MyServImpl implements MyService{

    private String name;
    private MyDao myDao;

    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void serviceOne() {
        System.out.println("MyServiceImpl..."+name);
        myDao.myDaoMethod();
    }

    @Override
    public void init() {
        System.out.println("init.........");
    }

    @Override
    public void destroy() {
        System.out.println("destroy.........");
    }
}
