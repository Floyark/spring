package com.aop.privilege;

public class ServiceImpl implements MyService {

    @PrivilegeInfo(value = "save")
    @Override
    public void save() {
        System.out.println("save");
    }

    @PrivilegeInfo(value = "update")
    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
