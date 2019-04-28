package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeSex;
import com.ssm.yingjia.po.TypeSexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeSexMapper {
    int countByExample(TypeSexExample example);

    int deleteByExample(TypeSexExample example);

    int deleteByPrimaryKey(Integer sexId);

    int insert(TypeSex record);

    int insertSelective(TypeSex record);

    List<TypeSex> selectByExample(TypeSexExample example);

    TypeSex selectByPrimaryKey(Integer sexId);

    int updateByExampleSelective(@Param("record") TypeSex record, @Param("example") TypeSexExample example);

    int updateByExample(@Param("record") TypeSex record, @Param("example") TypeSexExample example);

    int updateByPrimaryKeySelective(TypeSex record);

    int updateByPrimaryKey(TypeSex record);
}