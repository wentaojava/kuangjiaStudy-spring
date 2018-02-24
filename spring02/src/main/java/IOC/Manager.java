package IOC;

/**构造器注入
 * @time: 2018年02月24日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class Manager {
    private Computer computer;
    public Manager(){
        System.out.println("Manager()");
    }
    public Manager(Computer computer){
        System.out.println("Manager(Computer computer)");
        this.computer=computer;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "computer=" + computer +
                '}';
    }
}
