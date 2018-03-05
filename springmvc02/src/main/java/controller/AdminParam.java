package controller;

/**获取请求参数方式三的bean类
 * 用于封装请求参数值
 * 属性名与参数名一致
 * 需要提供对应的get/set方法
 * @time: 2018年03月02日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class AdminParam {
    private String adminCode;
    private String pwd;

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
