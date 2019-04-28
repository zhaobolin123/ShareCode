package com.ssm.yingjia.service.impl;

import com.ssm.yingjia.mapper.UserMapper;
import com.ssm.yingjia.po.User;
import com.ssm.yingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User testUser(Integer userId) throws Exception {
        return userMapper.selectByPrimaryKey(userId);
    }
}
