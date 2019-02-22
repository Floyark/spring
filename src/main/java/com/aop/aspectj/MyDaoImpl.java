package com.aop.aspectj;

public class MyDaoImpl implements MyDao {
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
