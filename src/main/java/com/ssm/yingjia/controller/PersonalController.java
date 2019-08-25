package com.ssm.yingjia.controller;


import com.ssm.yingjia.po.User;
import com.ssm.yingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.Serializable;
import java.util.UUID;

/**
 * 个人中心
 */

@Controller
public class PersonalController {

    @Autowired
    private UserService userService;

    /**
     * 返回个人信息页面
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "personal",method = RequestMethod.GET)
    public String personal(HttpServletRequest request) throws Exception {

        return "jsp/personal";
    }

    /**
     * 修改密码
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "update_pswd",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap update_pswd(String oldPassword, String newPassword , HttpServletRequest request) throws Exception {
//        System.out.println(oldPassword+newPassword);
        ModelMap modelMap = new ModelMap();
        User user = userService.selectUserById((User)request.getSession().getAttribute("currentUser"));
        if (oldPassword.equals(user.getUserPassword())){
            user.setUserPassword(newPassword);
            if (userService.updateUserById(user)) {
                //清除Session中的user
                request.getSession().removeAttribute("currentUser");

                modelMap.addAttribute("isOK",true);
                //让用户重新登录
                modelMap.addAttribute("url","login_page");
            }else{
                modelMap.addAttribute("isOK",false);
                modelMap.addAttribute("errMsg","未知错误");
            }
        }
        else{
            modelMap.addAttribute("isOK",false);
            modelMap.addAttribute("errMsg","原密码输入错误");
        }
        return modelMap;
    }

    @RequestMapping(value = "update_pic", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap update_pic(MultipartFile userPicFile, HttpServletRequest request) throws Exception{
        ModelMap modelMap = new ModelMap();
        String suffixName = userPicFile.getContentType().substring(userPicFile.getContentType().indexOf("/")+1);
        String userPic = UUID.randomUUID().toString().replace("-","")+"."+suffixName;
        String savePath = Thread.currentThread().getContextClassLoader().getResource("").toString();//  file:/项目真实路径/target/classes/
        savePath =  savePath.replace('/','\\').replace("file:\\","").replace("\\target\\classes\\","");
        savePath = savePath+"\\src\\main\\webapp\\WEB-INF\\img\\portrait/";
        File file = new File(savePath+userPic);
        userPicFile.transferTo(file);//实体保存
        User user = (User)request.getSession().getAttribute("currentUser");
        String oldPic = user.getUserPic();//旧userPic
        user.setUserPic(userPic);//设置新userPic
        if (userService.updateUserById(user)) {
            //删除旧userPic实体
            File oldFile = new File(savePath+oldPic);
            if (oldFile.exists()) {
                oldFile.delete();
            }
            //更新Session中的user
//            request.getSession().removeAttribute("currentUser");
            request.getSession().setAttribute("currentUser", user);
            modelMap.addAttribute("isOK",true);
            //让用户刷新页面
            modelMap.addAttribute("url","personal");
        }else{
            modelMap.addAttribute("isOK",false);
            modelMap.addAttribute("errMsg","未知错误");
        }

        return modelMap;
    }
}

