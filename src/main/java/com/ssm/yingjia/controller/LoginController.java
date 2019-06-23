package com.ssm.yingjia.controller;


import com.ssm.yingjia.po.User;
import com.ssm.yingjia.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录页面
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login_page",method = RequestMethod.GET)
    public String register_page(HttpServletRequest request) throws Exception {
        return "jsp/login";
    }

    @RequestMapping(value = "login_do",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap register_page(User user, HttpServletRequest request) throws Exception {
//        String userPhone = user.getUserPhone();
//        String userPassword = user.getUserPassword();
        ModelMap modelMap = new ModelMap();
        //判断手机号是否已注册
        if(!userService.userIsExist(user)){
            modelMap.addAttribute("isOK",false);
            modelMap.addAttribute("errMsg","该手机号尚未注册");
        }
        else{
            //登录
            User myUser = userService.getUser(user);
            if (myUser != null){
                request.getSession().setAttribute("currentUser",myUser);
                modelMap.addAttribute("isOK",true);
                modelMap.addAttribute("url","testMain");
            }
            else {
                modelMap.addAttribute("isOK",false);
                modelMap.addAttribute("errMsg","密码错误");
            }
        }

        return modelMap;
    }
}