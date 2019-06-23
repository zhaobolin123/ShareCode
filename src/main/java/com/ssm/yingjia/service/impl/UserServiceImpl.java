package com.ssm.yingjia.service.impl;

import com.ssm.yingjia.mapper.UserMapper;
import com.ssm.yingjia.po.User;
import com.ssm.yingjia.po.UserExample;
import com.ssm.yingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User testUser(Integer userId) throws Exception {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean userIsExist(User user) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(user.getUserPhone());
        if (userMapper.countByExample(userExample) > 0) return true;
        return false;
    }

    @Override
    public boolean addUser(User user) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowdayTime = dateFormat.format(new Date());
        Date nowDate = dateFormat.parse(nowdayTime);
        user.setUserTime(nowDate);
        if(userMapper.insertSelective(user) > 0) return true;
        return false;
    }

    @Override
    public User getUser(User user) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(user.getUserPhone()).andUserPasswordEqualTo(user.getUserPassword());
        List<User> list = userMapper.selectByExample(userExample);
        return list.get(0);
    }
}
