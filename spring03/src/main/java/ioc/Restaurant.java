package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**演示@Autowired和 @Qualifier
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component ("rest")
@Scope("prototype")
public class Restaurant {
    @Autowired
    @Qualifier("wt")
    private Waiter waiter;

    public Restaurant() {
        System.out.println("Restaurant()");
    }

   /* @Autowired
    public void setWaiter(@Qualifier("wt") Waiter waiter) {
        System.out.println("Restaurant.setWaiter()");
        this.waiter = waiter;
    }*/

    @Override
    public String toString() {
        return "Restaurant{" +
                "waiter=" + waiter +
                '}';
    }
}
