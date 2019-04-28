package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeMotion;
import com.ssm.yingjia.po.TypeMotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeMotionMapper {
    int countByExample(TypeMotionExample example);

    int deleteByExample(TypeMotionExample example);

    int deleteByPrimaryKey(Integer motionId);

    int insert(TypeMotion record);

    int insertSelective(TypeMotion record);

    List<TypeMotion> selectByExample(TypeMotionExample example);

    TypeMotion selectByPrimaryKey(Integer motionId);

    int updateByExampleSelective(@Param("record") TypeMotion record, @Param("example") TypeMotionExample example);

    int updateByExample(@Param("record") TypeMotion record, @Param("example") TypeMotionExample example);

    int updateByPrimaryKeySelective(TypeMotion record);

    int updateByPrimaryKey(TypeMotion record);
}