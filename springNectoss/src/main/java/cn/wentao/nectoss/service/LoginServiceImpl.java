package cn.wentao.nectoss.service;

import cn.wentao.nectoss.dao.AdminDao;
import cn.wentao.nectoss.entity.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 业务层接口实现
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService{

    @Resource(name="adminDao")
    private AdminDao adminDao;

    public Admin checkLogin(String adminCode, String pwd) {
        Admin admin=adminDao.findByAdminCode(adminCode);
        if(admin==null || "null".equals(admin) ){
            throw new ApplicationException("账号错误");
        }else if(!admin.getPassword().equals(pwd)) {
                throw new ApplicationException("密码错误");
        }
        return admin;
    }
}
