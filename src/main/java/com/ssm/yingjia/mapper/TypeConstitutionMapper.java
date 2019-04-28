package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeConstitution;
import com.ssm.yingjia.po.TypeConstitutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeConstitutionMapper {
    int countByExample(TypeConstitutionExample example);

    int deleteByExample(TypeConstitutionExample example);

    int deleteByPrimaryKey(Integer constitutionId);

    int insert(TypeConstitution record);

    int insertSelective(TypeConstitution record);

    List<TypeConstitution> selectByExample(TypeConstitutionExample example);

    TypeConstitution selectByPrimaryKey(Integer constitutionId);

    int updateByExampleSelective(@Param("record") TypeConstitution record, @Param("example") TypeConstitutionExample example);

    int updateByExample(@Param("record") TypeConstitution record, @Param("example") TypeConstitutionExample example);

    int updateByPrimaryKeySelective(TypeConstitution record);

    int updateByPrimaryKey(TypeConstitution record);
}