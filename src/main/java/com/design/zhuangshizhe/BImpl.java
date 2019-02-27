package com.design.zhuangshizhe;

public class BImpl implements B {

    private A a;
    public BImpl(A a){
        this.a=a;
    }

    @Override
    public String aFunc() {
        return a.aFunc()+"经过装饰后的";
    }
}
