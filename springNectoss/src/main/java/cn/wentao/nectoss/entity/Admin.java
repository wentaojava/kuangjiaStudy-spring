package cn.wentao.nectoss.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 登录用户实体类
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class Admin implements Serializable {

    private Integer id;
    private String adminCode;
    private String password;
    private String name;
    private String telephone;
    private String email;
    private Timestamp enrolldate;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + id +
                ", adminCode='" + adminCode + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", enrolldate=" + enrolldate +
                '}';
    }

    public Integer getAdminId() {
        return id;
    }
    public void setAdminId(Integer adminId) {
        this.id = adminId;
    }
    public String getAdminCode() {
        return adminCode;
    }
    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Timestamp getEnrolldate() {
        return enrolldate;
    }
    public void setEnrolldate(Timestamp enrolldate) {
        this.enrolldate = enrolldate;
    }

}