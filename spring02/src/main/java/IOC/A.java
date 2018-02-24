package IOC;

/**演示set方法注入
 * @time: 2018年02月24日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class A {
    private inte b;

    public void setB(inte b) {
        System.out.println("A.setB()");
        this.b = b;
    }

    public A(){
        System.out.println("A()");
    }
    public void execute(){
        System.out.println("A.execute()");
        //调用B的f1方法
        b.f1();
    }
}
