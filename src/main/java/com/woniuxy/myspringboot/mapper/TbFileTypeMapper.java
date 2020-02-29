package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbFileType;
import com.woniuxy.myspringboot.entity.TbFileTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbFileTypeMapper {
    int countByExample(TbFileTypeExample example);

    int deleteByExample(TbFileTypeExample example);

    int deleteByPrimaryKey(Integer fileTypeId);

    int insert(TbFileType record);

    int insertSelective(TbFileType record);

    List<TbFileType> selectByExample(TbFileTypeExample example);

    TbFileType selectByPrimaryKey(Integer fileTypeId);

    int updateByExampleSelective(@Param("record") TbFileType record, @Param("example") TbFileTypeExample example);

    int updateByExample(@Param("record") TbFileType record, @Param("example") TbFileTypeExample example);

    int updateByPrimaryKeySelective(TbFileType record);

    int updateByPrimaryKey(TbFileType record);
}