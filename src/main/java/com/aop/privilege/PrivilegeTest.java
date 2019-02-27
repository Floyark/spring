package com.aop.privilege;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = "classpath:com/aop/privilege/applicationContext.xml")
public class PrivilegeTest {

    @Resource(name = "myService")
    private MyService myService;

    @Resource(name = "privilegeAspect")
    PrivilegeAspect privilegeAspect;

    @Before
    public void init(){
        //给用户添加权限
        List<FirmPrivilege> list=new ArrayList<FirmPrivilege>();
        list.add(new FirmPrivilege("update"));
        privilegeAspect.setPrivileges(list);
    }
    @Test
    public void testOne(){
        myService.update();
        myService.delete();
        myService.save();
    }
}
