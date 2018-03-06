package cn.wentao.nectoss.service;

/**
 * 应用异常类
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class ApplicationException extends RuntimeException {

    public ApplicationException() {
    }

    public ApplicationException(String message) {
        super(message);
    }


}
