package com.bean;

import java.util.Map;

public class BeanMap {
    Map map;

    public void setMap2(Map map2) {
        this.map2 = map2;
    }

    Map map2;
    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "BeanMap{" +
                "map=" + map +
                ", map2=" + map2 +
                '}';
    }
}
