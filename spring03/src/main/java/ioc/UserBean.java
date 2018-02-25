package ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component("ub")
public class UserBean {
    @Value("我的天")
    private String name;

    @Value("#{config.pageSize}")
    private String pageSize;

    public String getName() {
        return name;
    }

    //@Value("我的天")
    public void setName(String name) {
        this.name = name;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", pageSize='" + pageSize + '\'' +
                '}';
    }
}
