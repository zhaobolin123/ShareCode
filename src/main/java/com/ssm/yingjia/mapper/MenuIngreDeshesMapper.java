package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.MenuIngreDeshes;
import com.ssm.yingjia.po.MenuIngreDeshesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuIngreDeshesMapper {
    int countByExample(MenuIngreDeshesExample example);

    int deleteByExample(MenuIngreDeshesExample example);

    int deleteByPrimaryKey(Integer menuIngreDeshesId);

    int insert(MenuIngreDeshes record);

    int insertSelective(MenuIngreDeshes record);

    List<MenuIngreDeshes> selectByExample(MenuIngreDeshesExample example);

    MenuIngreDeshes selectByPrimaryKey(Integer menuIngreDeshesId);

    int updateByExampleSelective(@Param("record") MenuIngreDeshes record, @Param("example") MenuIngreDeshesExample example);

    int updateByExample(@Param("record") MenuIngreDeshes record, @Param("example") MenuIngreDeshesExample example);

    int updateByPrimaryKeySelective(MenuIngreDeshes record);

    int updateByPrimaryKey(MenuIngreDeshes record);
}