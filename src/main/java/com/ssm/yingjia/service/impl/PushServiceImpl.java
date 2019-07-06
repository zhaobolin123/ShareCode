package com.ssm.yingjia.service.impl;

import com.ssm.yingjia.mapper.PushMapper;
import com.ssm.yingjia.po.PushVo;
import com.ssm.yingjia.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("PushService")
public class PushServiceImpl implements PushService {

    @Autowired
    private PushMapper pushMapper;


    @Override
    public List<PushVo> pushInfo(Integer currPage, int pageSize) throws Exception {
        Map<String, Object> data = new HashMap();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        return pushMapper.selectAll(data);
    }

    @Override
    public List<PushVo> pushInfoByType(Integer pushtype,Integer currPage, int pageSize) throws Exception {
        Map<String, Object> data = new HashMap();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("pushType",pushtype);
        return pushMapper.selectAllByType(data);
    }

    @Override
    public Integer countPush() throws Exception {
        return pushMapper.countAll();
    }

    @Override
    public Integer countPushByType(Integer type) throws Exception {
        return pushMapper.countAllByType(type);
    }
}
