package IOC;

/**构造器注入练习
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class Car {
    private Engineer engineer;

    public Car() {
        System.out.println("Car()");
    }

    public Car(Engineer engineer) {
        System.out.println("Car(engineer)");
        this.engineer = engineer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineer=" + engineer +
                '}';
    }
}
