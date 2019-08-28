package com.ssm.yingjia.service;

import com.ssm.yingjia.po.Push;
import com.ssm.yingjia.po.PushVo;

import java.util.List;

public interface PushService {
    //返回push
    List<PushVo> pushInfo(Integer currPage, int pageSize) throws Exception;

    List<PushVo> pushInfoByType(Integer pushtype,Integer currPage, int pageSize) throws Exception;

    Integer countPush() throws Exception;

    Integer countPushByType(Integer type) throws Exception;

    Push selectPushDetail(Integer push_id) throws Exception;
}
