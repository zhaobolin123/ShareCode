package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeDinnertime;
import com.ssm.yingjia.po.TypeDinnertimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeDinnertimeMapper {
    int countByExample(TypeDinnertimeExample example);

    int deleteByExample(TypeDinnertimeExample example);

    int deleteByPrimaryKey(Integer dinnertimeId);

    int insert(TypeDinnertime record);

    int insertSelective(TypeDinnertime record);

    List<TypeDinnertime> selectByExample(TypeDinnertimeExample example);

    TypeDinnertime selectByPrimaryKey(Integer dinnertimeId);

    int updateByExampleSelective(@Param("record") TypeDinnertime record, @Param("example") TypeDinnertimeExample example);

    int updateByExample(@Param("record") TypeDinnertime record, @Param("example") TypeDinnertimeExample example);

    int updateByPrimaryKeySelective(TypeDinnertime record);

    int updateByPrimaryKey(TypeDinnertime record);
}