package basic;

/**第一天的作业
 * 提供初始化和销毁方法
 * 由容器创建实例
 * 作用域为单例
 * 不适用延迟加载
 * @time: 2018年02月24日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class ExempleBean {
    public ExempleBean(){
        System.out.println("ExempleBean()");
    }
    public void init(){
        System.out.println("ExempleBean.init()");
    }
    public void destroy(){
        System.out.println("ExempleBean.destroy()");
    }
}
