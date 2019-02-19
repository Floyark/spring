package com.bean;

import java.util.List;

public class BeanList {
    private List<String> students;

    public void setStudents(List<String> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for(String str:students){
            stringBuffer.append(str);
        }
        return students.toString();
    }
}
