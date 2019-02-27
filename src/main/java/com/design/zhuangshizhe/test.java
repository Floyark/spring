package com.design.zhuangshizhe;

import org.junit.Test;


public class test {

    @Test
    public void test01(){
        A a=new BImpl(new AImpl());
        System.out.println(a.aFunc());
    }
}
