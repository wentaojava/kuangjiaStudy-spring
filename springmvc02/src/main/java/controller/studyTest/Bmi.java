package controller.studyTest;

import entity.BmiEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @time: 2018年03月02日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
public class Bmi {

    @RequestMapping("/openBmi.do")
    public String openBmi(){
        return "bmi";
    }

    @RequestMapping("/bmi.do")
    public String openBmi(BmiEntity bmi,ModelMap modelMap){
        Double shengao=bmi.getHeight();
        Double tizhong=bmi.getTiZhong();
        Double result=tizhong/shengao/shengao;
        System.out.println(result);
        if(result<19){
            String bmiResult="bmi是"+result+",过轻";
            modelMap.addAttribute("bmiResult",bmiResult);
            return "bmiresult";
        }else if(result>24){
            String bmiResult="bmi是"+result+",过重";
            modelMap.addAttribute("bmiResult",bmiResult);
            return "bmiresult";
        }else{
            String bmiResult="bmi是"+result+",正常";
            modelMap.addAttribute("bmiResult",bmiResult);
            return "bmiresult";
        }

    }
}
