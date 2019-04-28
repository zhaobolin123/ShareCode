package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeFlavor;
import com.ssm.yingjia.po.TypeFlavorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeFlavorMapper {
    int countByExample(TypeFlavorExample example);

    int deleteByExample(TypeFlavorExample example);

    int deleteByPrimaryKey(Integer flavorId);

    int insert(TypeFlavor record);

    int insertSelective(TypeFlavor record);

    List<TypeFlavor> selectByExample(TypeFlavorExample example);

    TypeFlavor selectByPrimaryKey(Integer flavorId);

    int updateByExampleSelective(@Param("record") TypeFlavor record, @Param("example") TypeFlavorExample example);

    int updateByExample(@Param("record") TypeFlavor record, @Param("example") TypeFlavorExample example);

    int updateByPrimaryKeySelective(TypeFlavor record);

    int updateByPrimaryKey(TypeFlavor record);
}