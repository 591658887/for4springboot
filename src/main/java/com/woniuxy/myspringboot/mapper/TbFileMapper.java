package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbFile;
import com.woniuxy.myspringboot.entity.TbFileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbFileMapper {
    int countByExample(TbFileExample example);

    int deleteByExample(TbFileExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(TbFile record);

    int insertSelective(TbFile record);

    List<TbFile> selectByExample(TbFileExample example);

    TbFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") TbFile record, @Param("example") TbFileExample example);

    int updateByExample(@Param("record") TbFile record, @Param("example") TbFileExample example);

    int updateByPrimaryKeySelective(TbFile record);

    int updateByPrimaryKey(TbFile record);
}