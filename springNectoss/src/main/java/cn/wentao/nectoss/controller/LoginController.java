package cn.wentao.nectoss.controller;

import cn.wentao.nectoss.entity.Admin;
import cn.wentao.nectoss.service.ApplicationException;
import cn.wentao.nectoss.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 登录控制器
 * @time: 2018年03月05日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
public class LoginController {
    @Resource(name="LoginService")
    private LoginService loginService;

    @RequestMapping("/toLogin.do")
    public String toLogin(){
        System.out.println("toLogin()");
        return "login";
    }

    @RequestMapping("/login.do")
    public String login(HttpServletRequest request) {
        System.out.println("login()");
        String admincode = request.getParameter("adminCode");
        String pwd = request.getParameter("password");
        System.out.println(admincode);
        try {
          Admin admin=loginService.checkLogin(admincode, pwd);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof ApplicationException) {
                request.setAttribute("login_failed", e.getMessage());
                return "login";
            }
            return "error";
        }
        return "redirect:toIndex.do";
    }




    @RequestMapping("/toIndex.do")
    public String toIndex(){
        System.out.println("toIndex()");
        return "index";
    }
}
