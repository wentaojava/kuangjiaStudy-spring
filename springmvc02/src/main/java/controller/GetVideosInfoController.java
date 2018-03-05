package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

/**获取指定文件夹下的信息
 * @time: 2018年03月01日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
@RequestMapping("info")
public class GetVideosInfoController {

    /**
     *
     * 作用：使用递归，输出指定文件夹内的所有文件
     * 参数：path：文件夹路径   deep：表示文件的层次深度，控制前置空格的个数
     * 前置空格缩进，显示文件层次结构
     */
    @RequestMapping("/getVideosInfo.do")
    public String getFile(){

        String path="F:/JavaStudyFile/框架学习/kuangjiaStudy/springmvc02/target/springmvc02/video";
        // 获得指定文件对象
        File file = new File(path);
        // 获得该文件夹内的所有文件
        File[] array = file.listFiles();
        for(int i=0;i<array.length;i++)
        {
            //如果是文件
            if(array[i].isFile())
            {
                System.out.println( array[i].getName());
                // 输出当前文件的完整路径
            }
        }
        return "result";
    }



}
