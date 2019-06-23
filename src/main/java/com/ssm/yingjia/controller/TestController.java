package com.ssm.yingjia.controller;


import com.ssm.yingjia.po.User;
import com.ssm.yingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试User
 */

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "testMain",method = RequestMethod.GET)
    public String testMain(HttpServletRequest request) throws Exception {

        return "jsp/index";
    }
}
