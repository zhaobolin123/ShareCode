package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.Ingredients;
import com.ssm.yingjia.po.IngredientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IngredientsMapper {
    int countByExample(IngredientsExample example);

    int deleteByExample(IngredientsExample example);

    int deleteByPrimaryKey(Integer ingreId);

    int insert(Ingredients record);

    int insertSelective(Ingredients record);

    List<Ingredients> selectByExample(IngredientsExample example);

    Ingredients selectByPrimaryKey(Integer ingreId);

    int updateByExampleSelective(@Param("record") Ingredients record, @Param("example") IngredientsExample example);

    int updateByExample(@Param("record") Ingredients record, @Param("example") IngredientsExample example);

    int updateByPrimaryKeySelective(Ingredients record);

    int updateByPrimaryKey(Ingredients record);
}