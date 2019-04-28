package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeAllergen;
import com.ssm.yingjia.po.TypeAllergenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeAllergenMapper {
    int countByExample(TypeAllergenExample example);

    int deleteByExample(TypeAllergenExample example);

    int deleteByPrimaryKey(Integer allergenId);

    int insert(TypeAllergen record);

    int insertSelective(TypeAllergen record);

    List<TypeAllergen> selectByExample(TypeAllergenExample example);

    TypeAllergen selectByPrimaryKey(Integer allergenId);

    int updateByExampleSelective(@Param("record") TypeAllergen record, @Param("example") TypeAllergenExample example);

    int updateByExample(@Param("record") TypeAllergen record, @Param("example") TypeAllergenExample example);

    int updateByPrimaryKeySelective(TypeAllergen record);

    int updateByPrimaryKey(TypeAllergen record);
}