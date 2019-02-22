package com.aop.cglib;

public class myCGLIBImpl implements myCGLIB {
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
