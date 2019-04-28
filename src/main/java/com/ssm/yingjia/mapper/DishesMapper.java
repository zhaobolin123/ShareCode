package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.Dishes;
import com.ssm.yingjia.po.DishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesMapper {
    int countByExample(DishesExample example);

    int deleteByExample(DishesExample example);

    int deleteByPrimaryKey(Integer dishesId);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    List<Dishes> selectByExample(DishesExample example);

    Dishes selectByPrimaryKey(Integer dishesId);

    int updateByExampleSelective(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByExample(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);
}