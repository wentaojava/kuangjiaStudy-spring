package test;

import basic.ExempleBean;
import basic.MessageServes;
import basic.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @time: 2018年02月24日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class TestCase {
    //测试作用域和延迟加载
    @Test
    public void test1(){
      String config="basic.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Teacher t1=applicationContext.getBean("teacher",Teacher
        .class);
        Teacher t2=applicationContext.getBean("teacher",Teacher
                .class);
        System.out.println(t1==t2);
    }

    //测试生命周期初始化方法
    @Test
    public void test2(){
        String config="basic.xml";
        /**
         * ApplicationContext中没有close方法
         * 需要用子接口AbstractApplicationContext
         * */
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        MessageServes m1=applicationContext.getBean("m1",MessageServes.class);
        //关闭容器才能看到销毁方法
        applicationContext.close();

    }
//第一天的作业
    @Test
    public void test3(){
        String config="basic.xml";
        /**
         * ApplicationContext中没有close方法
         * 需要用子接口AbstractApplicationContext
         * */
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        ExempleBean m1=applicationContext.getBean("exempleBean", ExempleBean.class);
        //关闭容器才能看到销毁方法
        applicationContext.close();

    }
}
