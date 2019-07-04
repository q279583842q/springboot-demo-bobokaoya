package com.sxt.sys.mapper;

import com.sxt.sys.pojo.Basic;
import com.sxt.sys.pojo.BasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicMapper {
    int countByExample(BasicExample example);

    int deleteByExample(BasicExample example);

    int deleteByPrimaryKey(Integer basicId);

    int insert(Basic record);

    int insertSelective(Basic record);

    List<Basic> selectByExample(BasicExample example);

    Basic selectByPrimaryKey(Integer basicId);

    int updateByExampleSelective(@Param("record") Basic record, @Param("example") BasicExample example);

    int updateByExample(@Param("record") Basic record, @Param("example") BasicExample example);

    int updateByPrimaryKeySelective(Basic record);

    int updateByPrimaryKey(Basic record);
}