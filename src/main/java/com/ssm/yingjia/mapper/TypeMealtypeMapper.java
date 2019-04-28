package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeMealtype;
import com.ssm.yingjia.po.TypeMealtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeMealtypeMapper {
    int countByExample(TypeMealtypeExample example);

    int deleteByExample(TypeMealtypeExample example);

    int deleteByPrimaryKey(Integer mealtypeId);

    int insert(TypeMealtype record);

    int insertSelective(TypeMealtype record);

    List<TypeMealtype> selectByExample(TypeMealtypeExample example);

    TypeMealtype selectByPrimaryKey(Integer mealtypeId);

    int updateByExampleSelective(@Param("record") TypeMealtype record, @Param("example") TypeMealtypeExample example);

    int updateByExample(@Param("record") TypeMealtype record, @Param("example") TypeMealtypeExample example);

    int updateByPrimaryKeySelective(TypeMealtype record);

    int updateByPrimaryKey(TypeMealtype record);
}