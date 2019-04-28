package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.TypeDrink;
import com.ssm.yingjia.po.TypeDrinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeDrinkMapper {
    int countByExample(TypeDrinkExample example);

    int deleteByExample(TypeDrinkExample example);

    int deleteByPrimaryKey(Integer drinkId);

    int insert(TypeDrink record);

    int insertSelective(TypeDrink record);

    List<TypeDrink> selectByExample(TypeDrinkExample example);

    TypeDrink selectByPrimaryKey(Integer drinkId);

    int updateByExampleSelective(@Param("record") TypeDrink record, @Param("example") TypeDrinkExample example);

    int updateByExample(@Param("record") TypeDrink record, @Param("example") TypeDrinkExample example);

    int updateByPrimaryKeySelective(TypeDrink record);

    int updateByPrimaryKey(TypeDrink record);
}