package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.Push;
import com.ssm.yingjia.po.PushExample;
import java.util.List;
import java.util.Map;

import com.ssm.yingjia.po.PushVo;
import org.apache.ibatis.annotations.Param;

public interface PushMapper {
    int countByExample(PushExample example);

    int deleteByExample(PushExample example);

    int deleteByPrimaryKey(Integer pushId);

    int insert(Push record);

    int insertSelective(Push record);

    List<Push> selectByExampleWithBLOBs(PushExample example);

    List<Push> selectByExample(PushExample example);

    Push selectByPrimaryKey(Integer pushId);

    int updateByExampleSelective(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExampleWithBLOBs(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExample(@Param("record") Push record, @Param("example") PushExample example);

    int updateByPrimaryKeySelective(Push record);

    int updateByPrimaryKeyWithBLOBs(Push record);

    int updateByPrimaryKey(Push record);

    List<PushVo> selectAll(Map<String,Object> data);

    List<PushVo> selectAllByType(Map<String,Object> data);

    Integer countAll();

    Integer countAllByType(Integer pushType);

    Push selectPushDetail(Integer push_id);
}