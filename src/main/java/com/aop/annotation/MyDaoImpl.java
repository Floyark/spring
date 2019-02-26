package com.aop.annotation;
import com.aop.annotation.MyDao;
public class MyDaoImpl implements MyDao {
    @Override
    public void save() {
        int i=1/0;
        System.out.println("save");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
