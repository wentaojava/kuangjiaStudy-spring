package cn.wentao.nectoss.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 * @time: 2018年03月06日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class SomeInterceptor implements HandlerInterceptor {

    /**DispatcherServlet在收到请求
     * 之后会先调用此方法
     *返回值为true，则继续向后处理
     * 返回值为false,则结束
     * DispatcherServlet，拦截器以及处理器会共享同一个request,response
     * Object o:Controller的方法对象
     * */
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse,
                             Object o) throws Exception {
        System.out.println("preHandle");
        HttpSession session=httpServletRequest.getSession();
        Object admin=session.getAttribute("admin");
        if(admin==null || "".equals(admin)){
            httpServletResponse.sendRedirect("/toLogin.do");
            return false;
        }else{
            return true;
        }

    }

    /**Controller方法执行完毕返回数据给前端之前
     * 会执行此方法。可以在此方法下修改ModelAndView
     * 的值
     * */
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    /**
     *最后执行的方法
     * Exception e：是所有抛出的异常
     * */
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }
}
