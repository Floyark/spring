package com.aop.jdk;

public class MyJDKProxyImpl implements MyJDKProxy {
    @Override
    public void save() {
        System.out.println("save:-------");
    }
    @Override
    public void update() {
        System.out.println("update:-------");
    }
}
