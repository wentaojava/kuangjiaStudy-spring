package test;

import Autowire.Bar;
import IOC.A;
import IOC.Car;
import IOC.Manager;
import Value.ExampleBean;
import Value.InfoBean;
import Value.ValueBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

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
    //自动装配
    @Test
    public void test3(){
        String config="AutoWire.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Bar a=applicationContext.getBean("bar", Bar.class);
        System.out.println(a);

    }
    //构造器注入练习
    @Test
    public void test4(){
        String config="IOC.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Car a=applicationContext.getBean("car", Car.class);
        System.out.println(a);

    }
    //注入基本类型的值
    @Test
    public void test5(){
        String config="Value.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        ValueBean a=applicationContext.getBean("vb1", ValueBean.class);
        System.out.println(a);

    }
    //引用的方式注入集合类型
    @Test
    public void test6(){
        String config="Value.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        ExampleBean a=applicationContext.getBean("eb1", ExampleBean.class);
        System.out.println(a);

    }
    //读取Properties文件内容
    @Test
    public void test7(){
        String config="Value.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Properties a=applicationContext.getBean("config", Properties.class);
        System.out.println(a);
        System.out.println(a.getProperty("pageSize"));
    }
    //spring表达式
    @Test
    public void test8(){
        String config="Value.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        InfoBean a=applicationContext.getBean("info1", InfoBean.class);
        System.out.println(a);

    }
}
