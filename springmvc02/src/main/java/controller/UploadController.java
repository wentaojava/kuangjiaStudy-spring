package controller;

import entity.FileEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import tools.FileUploadTool;

import javax.servlet.http.HttpServletRequest;

/**上传视屏控制类
 * @time: 2018年03月01日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
@RequestMapping("upload")
public class UploadController {
    @RequestMapping("/upload.do")
    public String openUpload(){
        return "upload";

    }
    @RequestMapping(value = "/uploadFile.do", method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String upload(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
                               HttpServletRequest request, ModelMap map) {
        String message = "";
        FileEntity entity = new FileEntity();
        FileUploadTool fileUploadTool = new FileUploadTool();
        try {
            entity = fileUploadTool.createFile(multipartFile, request);
            if (entity != null) {
                message = "上传成功";
                map.addAttribute("entity", entity);
                map.addAttribute("result", message);
            } else {
                message = "上传失败";
                map.addAttribute("result", message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return new ModelAndView("result", map);
        return "result";
    }
}

