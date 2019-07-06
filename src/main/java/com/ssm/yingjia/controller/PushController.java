package com.ssm.yingjia.controller;

import com.ssm.yingjia.po.Push;
import com.ssm.yingjia.po.PushVo;
import com.ssm.yingjia.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ssm.yingjia.po.User;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * 登录页面
 */

@Controller
public class PushController {

    @Autowired
    private PushService pushService;

    //返回推送界面或全部消息
    @RequestMapping(value = "push",method = RequestMethod.GET)
    public String push_page(HttpServletRequest request,Integer currPage) throws Exception {
        User user = (User) request.getSession().getAttribute("currentUser");
        if(user==null){
            return "redirect:/login_page";
        }
        else{
            Integer count = pushService.countPush();
            Integer PageCount;
            if(count%4==0){
                PageCount = count/4;
            }
            else{
                PageCount = (count/4)+1;
            }
            System.out.println(currPage);
            List<PushVo> pushlist = pushService.pushInfo(currPage,4);
            request.setAttribute("push",pushlist);
            request.setAttribute("PageCount",PageCount);
            return "jsp/push";
        }
    }

    //返回营养知识
    @RequestMapping(value = "pushbytype",method = RequestMethod.GET)
    public String push_page(HttpServletRequest request, Integer pushtype,Integer currPage) throws Exception {
        User user = (User) request.getSession().getAttribute("currentUser");
        if(user==null){
            return "redirect:/login_page";
        }
        else{
            Integer count = pushService.countPushByType(pushtype);
            Integer PageCount;
            if(count%4==0){
                PageCount = count/4;
            }
            else{
                PageCount = (count/4)+1;
            }
            List<PushVo> pushlist = pushService.pushInfoByType(pushtype,currPage,4);
            request.setAttribute("push",pushlist);
            request.setAttribute("PageCount",PageCount);
            return "jsp/push";
        }
    }


}
