package com.aop.privilege;

public interface MyService {
    /*使用PrivilegeInfo 配置为save*/
    public void save();

    /*使用PrivilegeInfo 配置为update*/
    public void update();

    /*不使用PrivilegeInfo*/
    public void delete();
}
