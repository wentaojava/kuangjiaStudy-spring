package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**构造器注入
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component("b")
public class Bar {
    private Waiter waiter;

    @Autowired
    public Bar(@Qualifier("wt") Waiter waiter) {
        System.out.println("Bar()");
        this.waiter = waiter;
    }

    public Bar() {
        System.out.println("Bar()");
    }

    @Override
    public String toString() {
        return "Bar{" +
                "waiter=" + waiter +
                '}';
    }
}
