package com.woniuxy.myspringboot.mapper;

import com.woniuxy.myspringboot.entity.TbCountry;
import com.woniuxy.myspringboot.entity.TbCountryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbCountryMapper {
    int countByExample(TbCountryExample example);

    int deleteByExample(TbCountryExample example);

    int deleteByPrimaryKey(String countyName);

    int insert(TbCountry record);

    int insertSelective(TbCountry record);

    List<TbCountry> selectByExample(TbCountryExample example);

    TbCountry selectByPrimaryKey(String countyName);

    int updateByExampleSelective(@Param("record") TbCountry record, @Param("example") TbCountryExample example);

    int updateByExample(@Param("record") TbCountry record, @Param("example") TbCountryExample example);

    int updateByPrimaryKeySelective(TbCountry record);

    int updateByPrimaryKey(TbCountry record);
}