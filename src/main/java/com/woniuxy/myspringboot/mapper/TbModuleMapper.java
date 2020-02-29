package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbModule;
import com.woniuxy.myspringboot.entity.TbModuleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbModuleMapper {
    int countByExample(TbModuleExample example);

    int deleteByExample(TbModuleExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    List<TbModule> selectByExample(TbModuleExample example);

    TbModule selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") TbModule record, @Param("example") TbModuleExample example);

    int updateByExample(@Param("record") TbModule record, @Param("example") TbModuleExample example);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);
}