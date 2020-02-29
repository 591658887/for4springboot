package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbIndustry;
import com.woniuxy.myspringboot.entity.TbIndustryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbIndustryMapper {
    int countByExample(TbIndustryExample example);

    int deleteByExample(TbIndustryExample example);

    int insert(TbIndustry record);

    int insertSelective(TbIndustry record);

    List<TbIndustry> selectByExample(TbIndustryExample example);

    int updateByExampleSelective(@Param("record") TbIndustry record, @Param("example") TbIndustryExample example);

    int updateByExample(@Param("record") TbIndustry record, @Param("example") TbIndustryExample example);
}