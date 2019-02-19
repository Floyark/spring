package com.bean;

import java.util.Map;

public class BeanMap {
    Map map;

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "BeanMap{" +
                "map=" + map +
                '}';
    }
}
