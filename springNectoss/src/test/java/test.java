import cn.wentao.nectoss.dao.AdminDao;
import cn.wentao.nectoss.entity.Admin;
import cn.wentao.nectoss.service.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class test {

    @Test
    //测试连接池
    public void test1(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        DataSource ds=ac.getBean("ds",DataSource.class);
        try {
            System.out.println(ds.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    //测试持久层
    public void test2(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        AdminDao adminDao=ac.getBean("adminDao",AdminDao.class);
        Admin admin=adminDao.findByAdminCode("wt");
        System.out.println(admin);
    }

    @Test
    //测试业务层
    public void test3(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        LoginService ls=ac.getBean("LoginService",LoginService.class);
        Admin admin=ls.checkLogin("wt","1");
        System.out.println(admin);
    }
}
