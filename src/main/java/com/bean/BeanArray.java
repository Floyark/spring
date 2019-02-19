package com.bean;

import java.util.Arrays;

public class BeanArray {
    private String [] strs;

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    @Override
    public String toString() {
        return "BeanArray{" +
                "strs=" + Arrays.toString(strs) +
                '}';
    }
}
