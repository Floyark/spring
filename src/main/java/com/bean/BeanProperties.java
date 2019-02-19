package com.bean;

import java.util.Properties;

public class BeanProperties {
    private Properties pre;

    public void setPre(Properties pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "BeanProperties{" +
                "pre=" + pre +
                '}';
    }
}
