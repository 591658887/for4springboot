package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbProjectStatus;
import com.woniuxy.myspringboot.entity.TbProjectStatusExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbProjectStatusMapper {
    int countByExample(TbProjectStatusExample example);

    int deleteByExample(TbProjectStatusExample example);

    int deleteByPrimaryKey(Integer projectStatusId);

    int insert(TbProjectStatus record);

    int insertSelective(TbProjectStatus record);

    List<TbProjectStatus> selectByExample(TbProjectStatusExample example);

    TbProjectStatus selectByPrimaryKey(Integer projectStatusId);

    int updateByExampleSelective(@Param("record") TbProjectStatus record, @Param("example") TbProjectStatusExample example);

    int updateByExample(@Param("record") TbProjectStatus record, @Param("example") TbProjectStatusExample example);

    int updateByPrimaryKeySelective(TbProjectStatus record);

    int updateByPrimaryKey(TbProjectStatus record);
}