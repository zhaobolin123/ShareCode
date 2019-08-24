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
* Author: 赵博林
* @Date 2019/7/8 13:55
* @Description: 新闻推送controller
*/

@Controller
public class PushController {

    @Autowired
    private PushService pushService;

//    /**
//    * Author: 赵博林
//    * @Date 2019/7/8 13:56
//    * @Description: 返回全部消息
//    * @Param: [request, currPage]
//    * @return : java.lang.String
//    */
//    @RequestMapping(value = "push",method = RequestMethod.GET)
//    public String push_page(HttpServletRequest request,Integer currPage) throws Exception {
//        User user = (User) request.getSession().getAttribute("currentUser");
//        if(user==null){
//            return "redirect:/login_page";
//        }
//        else{
//            Integer count = pushService.countPush();
//            Integer PageCount;
//            if(count%4==0){
//                PageCount = count/4;
//            }
//            else{
//                PageCount = (count/4)+1;
//            }
//            if (PageCount<currPage){
//                currPage=1;
//            }
//            List<PushVo> pushlist = pushService.pushInfo(currPage,4);
//            request.setAttribute("push",pushlist);
//            request.setAttribute("PageCount",PageCount);
//            request.setAttribute("currPage",currPage);
//            return "jsp/push";
//        }
//    }

    /**
    * Author: 赵博林
    * @Date 2019/7/8 13:57
    * @Description: 返回分类消息
    * @Param: [request, pushtype, currPage]
    * @return : java.lang.String
    */
    @RequestMapping(value = "pushbytype",method = RequestMethod.GET)
    public String push_pageType(HttpServletRequest request, Integer pushtype,Integer currPage) throws Exception {
        User user = (User) request.getSession().getAttribute("currentUser");
        List<PushVo> pushlist;
        Integer count;
        if(user==null){
            return "redirect:/login_page";
        }
        else{
            if (pushtype==0){
                count = pushService.countPush();
            }
            else {
                count = pushService.countPushByType(pushtype);
            }
            Integer PageCount;
            if(count%4==0){
                PageCount = count/4;
            }
            else{
                PageCount = (count/4)+1;
            }
            if (PageCount<currPage){
                currPage=1;
            }

            if (pushtype==0){
                pushlist = pushService.pushInfo(currPage,4);
            }
            else{
                pushlist = pushService.pushInfoByType(pushtype,currPage,4);
            }
            request.setAttribute("push",pushlist);
            request.setAttribute("PageCount",PageCount);
            request.setAttribute("currPage",currPage);
            request.setAttribute("pushtype",pushtype);
            return "jsp/push";
        }
    }


}
