package com.ssm.yingjia.service;

import com.ssm.yingjia.po.User;

public interface UserService {
    //测试
    User testUser(Integer userId) throws Exception;
    //判断用户是否已被注册
    boolean userIsExist(User user) throws Exception;
    //注册
    boolean addUser(User user) throws Exception;
    //登录
    User getUser(User user) throws Exception;
}
