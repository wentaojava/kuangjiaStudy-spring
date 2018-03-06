package cn.wentao.nectoss.service;

import cn.wentao.nectoss.entity.Admin;
import org.springframework.stereotype.Service;

/**
 * 业务层接口
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Service
public interface LoginService {
    /**
     * 检查登录
     * */
    public Admin checkLogin(String adminCode,String pwd);
}
