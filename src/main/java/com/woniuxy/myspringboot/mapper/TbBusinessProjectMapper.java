package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbBusinessProject;
import com.woniuxy.myspringboot.entity.TbBusinessProjectExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbBusinessProjectMapper {
    int countByExample(TbBusinessProjectExample example);

    int deleteByExample(TbBusinessProjectExample example);

    int deleteByPrimaryKey(Integer businessProjectId);

    int insert(TbBusinessProject record);

    int insertSelective(TbBusinessProject record);

    List<TbBusinessProject> selectByExample(TbBusinessProjectExample example);

    TbBusinessProject selectByPrimaryKey(Integer businessProjectId);

    int updateByExampleSelective(@Param("record") TbBusinessProject record, @Param("example") TbBusinessProjectExample example);

    int updateByExample(@Param("record") TbBusinessProject record, @Param("example") TbBusinessProjectExample example);

    int updateByPrimaryKeySelective(TbBusinessProject record);

    int updateByPrimaryKey(TbBusinessProject record);
}