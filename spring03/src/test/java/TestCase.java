import ioc.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class TestCase {

    //测试组件扫描
    @Test
    public void test1(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student stu1=ac.getBean("stu", Student.class);
        System.out.println(stu1);
    }
    //测试作用域
    @Test
    public void test2(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student stu1=ac.getBean("stu", Student.class);
        Student stu2=ac.getBean("stu", Student.class);
        System.out.println(stu1==stu2);
    }
    //测试延迟加载和指定初始化，销毁方法
    @Test
    public void test3(){
        String config="applicationContext.xml";
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student stu1=ac.getBean("stu", Student.class);
        ac.close();
    }
    //测试Autowired和Qualifier
    @Test
    public void test4(){
        String config="applicationContext.xml";
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Restaurant rest=ac.getBean("rest", Restaurant.class);
        System.out.println(rest);
    }
    //测试Autowired和Qualifier，用构造器注入
    @Test
    public void test5(){
        String config="applicationContext.xml";
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Bar b=ac.getBean("b", Bar.class);
        System.out.println(b);
    }
    //测试Resource
    @Test
    public void test6(){
        String config="applicationContext.xml";
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Leader b=ac.getBean("le", Leader.class);
        System.out.println(b);
    }
    //测试Value
    @Test
    public void test7(){
        String config="applicationContext.xml";
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext(config);
        UserBean b=ac.getBean("ub", UserBean.class);
        System.out.println(b);
    }
}
