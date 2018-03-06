package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @time: 2018年03月06日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(){
        System.out.println("hello()");
        return "hello";
    }

    @RequestMapping("/demo/hello.do")
    public String hello2(){
        System.out.println("hello2()");
        return "hello";
    }
}
