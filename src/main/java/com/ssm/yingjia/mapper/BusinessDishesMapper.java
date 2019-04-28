package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.BusinessDishes;
import com.ssm.yingjia.po.BusinessDishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessDishesMapper {
    int countByExample(BusinessDishesExample example);

    int deleteByExample(BusinessDishesExample example);

    int deleteByPrimaryKey(Integer businessDishesId);

    int insert(BusinessDishes record);

    int insertSelective(BusinessDishes record);

    List<BusinessDishes> selectByExample(BusinessDishesExample example);

    BusinessDishes selectByPrimaryKey(Integer businessDishesId);

    int updateByExampleSelective(@Param("record") BusinessDishes record, @Param("example") BusinessDishesExample example);

    int updateByExample(@Param("record") BusinessDishes record, @Param("example") BusinessDishesExample example);

    int updateByPrimaryKeySelective(BusinessDishes record);

    int updateByPrimaryKey(BusinessDishes record);
}