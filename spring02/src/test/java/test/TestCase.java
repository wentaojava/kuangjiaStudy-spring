package test;

import IOC.A;
import IOC.Manager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @time: 2018年02月24日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class TestCase {
    @Test
    public void test1(){
        String config="IOC.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        A a=applicationContext.getBean("a1", A.class);
        a.execute();

    }
//构造器注入
    @Test
    public void test2(){
        String config="IOC.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Manager a=applicationContext.getBean("m1", Manager.class);
        System.out.println(a);

    }
}
