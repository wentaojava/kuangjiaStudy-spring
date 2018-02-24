package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        System.out.println(applicationContext);
    }
}
