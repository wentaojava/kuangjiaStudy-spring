package ioc;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component ("stu")
@Scope("singleton")
@Lazy(true)
public class Student {
    public Student() {
        System.out.println("Student()");
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁方法");
    }
}
