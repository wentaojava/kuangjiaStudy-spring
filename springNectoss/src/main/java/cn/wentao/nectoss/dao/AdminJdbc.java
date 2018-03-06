package cn.wentao.nectoss.dao;

import cn.wentao.nectoss.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 持久层接口实现
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Repository("adminDao")
public class AdminJdbc implements AdminDao{

    @Resource(name="ds")
    private DataSource dataSource;


    public Admin findByAdminCode(String adminCode) {
        Admin  admin=null;
        Connection c=null;
        try {
            c= dataSource.getConnection();
            String sql="select * from admin where admin_code=?";
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,adminCode);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                admin=new Admin();
                admin.setAdminId(rs.getInt("id"));
                admin.setAdminCode(rs.getString("admin_code"));
                admin.setPassword(rs.getString("password"));
                admin.setName(rs.getString("name"));
                admin.setTelephone(rs.getString("telephone"));
                admin.setEmail(rs.getString("email"));
                admin.setEnrolldate(rs.getTimestamp("enrolldate"));
                //return admin;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("连接失败",e);
        }finally {
            if(c!=null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException("关闭连接失败",e);
                }
            }
        }
        return admin;
    }

    public Admin findAdmin() {
        Admin admin=null;
        Connection c=null;
        try {
            c= dataSource.getConnection();
            String sql="select * from admin";
            PreparedStatement ps=c.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                admin=new Admin();
                admin.setAdminId(rs.getInt("id"));
                admin.setAdminCode(rs.getString("admin_code"));
                admin.setPassword(rs.getString("password"));
                admin.setName(rs.getString("name"));
                admin.setTelephone(rs.getString("telephone"));
                admin.setEmail(rs.getString("email"));
                admin.setEnrolldate(rs.getTimestamp("enrolldate"));
                //return admin;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("连接失败",e);
        }finally {
            if(c!=null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException("关闭连接失败",e);
                }
            }
        }
        return admin;
    }

}
