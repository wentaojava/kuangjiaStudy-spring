package controller;


//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @time: 2018年02月26日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */

public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("handleRequest");
        /**
         * ModelAndView有两个常用构造器
         * ModelAndView（String viewName）
         * ModelAndView(String viewName,Map data)
         * viewName:视图名,与对应的Jsp名称相同
         * data:处理结果
         * */
        return new ModelAndView("hello");
    }
}
