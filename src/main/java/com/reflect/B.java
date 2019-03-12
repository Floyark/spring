package com.reflect;

public class B  implements A{

    static int anInt=0;
    public B(){
        System.out.println("-无参构造-"+anInt);
    }
    public B(int i){
        anInt=i;
        System.out.println("有参构造："+anInt);
    }
    public B(int i,int j,int k){
        System.out.println("拥有三个参数的构造方法："+i+j+k);
    }
    @Override
    public String fun1(int i) {
        anInt+=i;
        return String.valueOf(anInt);
    }
}
