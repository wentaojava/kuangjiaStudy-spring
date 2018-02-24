package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * @time: 2018年02月23日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class FirstSpring {
    public static void main(String[] args) {
        String config="applicationContext.xml";
        /**
        *ApplicationContext是接口
         * ClassPathXmlApplicationContext是接口的实现类，会根据
         * 类路径去查找spring的配置文件，然后启动容器
         */
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        //System.out.println(applicationContext);
        //启动容器
        Student stu=applicationContext.getBean("stu1",Student.class);
        System.out.println(stu);
        Date d=applicationContext.getBean("date",Date.class);
        System.out.println(d);
        Calendar c=applicationContext.getBean("cel1",Calendar.class);
        System.out.println(c);
        Date time=applicationContext.getBean("time",Date.class);
        System.out.println(time);
    }
}
