package ioc;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**演示 @Resource
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component("le")
public class Leader {
    @Resource(name="wt")
    private Waiter waiter;

    /*@Resource(name="wt")
    public void setWaiter(Waiter waiter) {
        System.out.println("Leader.setWaiter()");
        this.waiter = waiter;
    }*/

    public Leader() {
        System.out.println("Leader()");
    }

    @Override
    public String toString() {
        return "Leader{" +
                "waiter=" + waiter +
                '}';
    }
}
