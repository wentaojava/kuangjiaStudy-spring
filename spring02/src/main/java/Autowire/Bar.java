package Autowire;

/**自动装配
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class Bar {
    private Foo foo;
    public Bar() {
        System.out.println("Bar()");
    }

    public void setFoo(Foo foo){
        System.out.println("Bar.setFoo()");
        this.foo=foo;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "foo=" + foo +
                '}';
    }
}
