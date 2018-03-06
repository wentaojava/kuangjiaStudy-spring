package cn.wentao.nectoss.dao;

import cn.wentao.nectoss.entity.Admin;

/**
 * 持久层接口
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public interface AdminDao {

    public Admin findByAdminCode(String adminCode);

    public Admin findAdmin();
}
