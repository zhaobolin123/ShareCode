package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeAge;
import com.ssm.yingjia.po.TypeAgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeAgeMapper {
    int countByExample(TypeAgeExample example);

    int deleteByExample(TypeAgeExample example);

    int deleteByPrimaryKey(Integer ageId);

    int insert(TypeAge record);

    int insertSelective(TypeAge record);

    List<TypeAge> selectByExample(TypeAgeExample example);

    TypeAge selectByPrimaryKey(Integer ageId);

    int updateByExampleSelective(@Param("record") TypeAge record, @Param("example") TypeAgeExample example);

    int updateByExample(@Param("record") TypeAge record, @Param("example") TypeAgeExample example);

    int updateByPrimaryKeySelective(TypeAge record);

    int updateByPrimaryKey(TypeAge record);
}