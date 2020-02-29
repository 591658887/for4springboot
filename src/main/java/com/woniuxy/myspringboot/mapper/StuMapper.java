package com.woniuxy.myspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.myspringboot.entity.Stu;

@Mapper
public interface StuMapper {
   void insertStu (Stu stu);
   
}