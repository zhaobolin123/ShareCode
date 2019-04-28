package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypePlan;
import com.ssm.yingjia.po.TypePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypePlanMapper {
    int countByExample(TypePlanExample example);

    int deleteByExample(TypePlanExample example);

    int deleteByPrimaryKey(Integer planId);

    int insert(TypePlan record);

    int insertSelective(TypePlan record);

    List<TypePlan> selectByExample(TypePlanExample example);

    TypePlan selectByPrimaryKey(Integer planId);

    int updateByExampleSelective(@Param("record") TypePlan record, @Param("example") TypePlanExample example);

    int updateByExample(@Param("record") TypePlan record, @Param("example") TypePlanExample example);

    int updateByPrimaryKeySelective(TypePlan record);

    int updateByPrimaryKey(TypePlan record);
}