package com.bean;

public class MyBean {
    private String name;
    private String age;

    public MyBean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
