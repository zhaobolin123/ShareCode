package com.ssm.yingjia.mapper;

import com.ssm.yingjia.po.IngreDeshes;
import com.ssm.yingjia.po.IngreDeshesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IngreDeshesMapper {
    int countByExample(IngreDeshesExample example);

    int deleteByExample(IngreDeshesExample example);

    int deleteByPrimaryKey(Integer ingreDeshesId);

    int insert(IngreDeshes record);

    int insertSelective(IngreDeshes record);

    List<IngreDeshes> selectByExample(IngreDeshesExample example);

    IngreDeshes selectByPrimaryKey(Integer ingreDeshesId);

    int updateByExampleSelective(@Param("record") IngreDeshes record, @Param("example") IngreDeshesExample example);

    int updateByExample(@Param("record") IngreDeshes record, @Param("example") IngreDeshesExample example);

    int updateByPrimaryKeySelective(IngreDeshes record);

    int updateByPrimaryKey(IngreDeshes record);
}