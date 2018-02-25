package ioc;

import org.springframework.stereotype.Component;

/**
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component("wt")
public class Waiter {
    public Waiter() {
        System.out.println("Waiter()");
    }
}
