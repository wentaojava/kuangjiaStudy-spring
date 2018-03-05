package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**基于注解的springmvc的controller
 * 处理器类：
 * 1、不用实现Controller接口
 * 2、方法名不做要求，返回值可以是ModelAndView,也可以是string(视图名）
 * 3、可以添加多个方法
 * 4、使用@Controller
 * 5、可以在方法前或者类前添加@RequestMapping(相当于HandlerMapping)
 * @time: 2018年02月28日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
@RequestMapping("study")
public class HelloController {
    @RequestMapping("/hello.do")
    public String hello(){
        System.out.println("helloController");
        return "hello";
    }

    @RequestMapping("/login.do")
    public String login(){
        System.out.println("loginController");
        return "login";
    }

    @RequestMapping("/login1.do")
    public String login1(AdminParam adminParam){
        System.out.println("login1Controller");
        String adminCode=adminParam.getAdminCode();
        System.out.println(adminCode);
        return "hello";
    }

    /**
     * 重定向
     * 方法返回值是string
     * */
    @RequestMapping("/login2.do")
    public String login2(){
        System.out.println("login2()");
        return "redirect:hello.do";
    }

    /**
     * 重定向
     * 方法返回值是ModelAndView
     * */
    @RequestMapping("/login3.do")
    public ModelAndView login3(){
        System.out.println("login3()");
        RedirectView rv=new RedirectView("hello.do");
        ModelAndView mv=new ModelAndView(rv);
        return mv;
    }

}
