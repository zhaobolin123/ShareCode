package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.Dietitian;
import com.ssm.yingjia.po.DietitianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DietitianMapper {
    int countByExample(DietitianExample example);

    int deleteByExample(DietitianExample example);

    int deleteByPrimaryKey(Integer dietitianId);

    int insert(Dietitian record);

    int insertSelective(Dietitian record);

    List<Dietitian> selectByExample(DietitianExample example);

    Dietitian selectByPrimaryKey(Integer dietitianId);

    int updateByExampleSelective(@Param("record") Dietitian record, @Param("example") DietitianExample example);

    int updateByExample(@Param("record") Dietitian record, @Param("example") DietitianExample example);

    int updateByPrimaryKeySelective(Dietitian record);

    int updateByPrimaryKey(Dietitian record);
}