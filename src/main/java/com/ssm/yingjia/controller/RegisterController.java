package com.ssm.yingjia.controller;


import com.ssm.yingjia.po.User;
import com.ssm.yingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 注册页面
 */

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "register_page",method = RequestMethod.GET)
    public String register_page(HttpServletRequest request) throws Exception {
        return "jsp/register";
    }

    @RequestMapping(value = "register_do",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap register_do(User user, HttpServletRequest request) throws Exception {
//        String userNickname = user.getUserNickname();
//        String userPhone = user.getUserPhone();
//        String userPassword = user.getUserPassword();
        ModelMap modelMap = new ModelMap();
        //判断手机号是否已注册
        if(userService.userIsExist(user)){
            modelMap.addAttribute("isOK",false);
            modelMap.addAttribute("errMsg","手机号已被注册");
        }
        else{
            //注册
            if (userService.addUser(user)){
                modelMap.addAttribute("isOK",true);
                modelMap.addAttribute("url","login_page");
            }
            else {
                modelMap.addAttribute("isOK",false);
                modelMap.addAttribute("errMsg","服务器出错");
            }
        }

        return modelMap;
    }
}
