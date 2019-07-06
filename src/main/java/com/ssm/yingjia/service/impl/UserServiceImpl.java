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

    /**
     * 用手机号判断一个用户是否已存在
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public boolean userIsExist(User user) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(user.getUserPhone());
        if (userMapper.countByExample(userExample) > 0) return true;
        return false;
    }

    /**
     * 添加一个用户
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public boolean addUser(User user) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowdayTime = dateFormat.format(new Date());
        Date nowDate = dateFormat.parse(nowdayTime);
        user.setUserTime(nowDate);
        if(userMapper.insertSelective(user) > 0) return true;
        return false;
    }

    /**
     * 通过手机号和密码查询一个用户
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public User getUser(User user) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(user.getUserPhone()).andUserPasswordEqualTo(user.getUserPassword());
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()>0) return list.get(0);
        return null;
    }

    /**
     * 用id查询一个用户
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public User selectUserById(User user) throws Exception {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(user.getUserId());
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()>0) return list.get(0);
        return null;
    }

    /**
     * 根据id修改一个用户
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateUserById(User user) throws Exception {
        if (userMapper.updateByPrimaryKeySelective(user)>0)  return true;
        return false;
    }
}
