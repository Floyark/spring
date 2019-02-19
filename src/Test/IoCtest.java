import com.bean.*;
import com.service.MyServImpl;
import com.service.MyService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCtest {


    static Logger logger=Logger.getLogger(IoCtest.class);
    //IoC
    @Test
    public void testOne(){
        logger.error(this.getClass());
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService myService = (MyService)applicationContext.getBean("myServImpl");
        myService.serviceOne();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

    @Test
    public void testTwo(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBean myBean = (MyBean)applicationContext.getBean("myBean");
        System.out.println(myBean.toString());
    }

    @Test
    public void testThree(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanArray beanArray=(BeanArray)applicationContext.getBean("beanArray");
        System.out.println(beanArray.toString());
    }

    @Test
    public void testFour(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanList beanList = (BeanList) applicationContext.getBean("beanList");
        System.out.println(beanList.toString());
    }


    @Test
    public void testFive(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanMap beanMap= (BeanMap) applicationContext.getBean("beanMap");
        System.out.println(beanMap.toString());
    }

    @Test
    public void testSix(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanProperties beanProperties= (BeanProperties) applicationContext.getBean("beanProperties");
        System.out.println(beanProperties.toString());
    }



    @Test
    public void textSeven(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanMap map= (BeanMap) applicationContext.getBean("beanMap");
        System.out.println(map.toString());
    }
}
