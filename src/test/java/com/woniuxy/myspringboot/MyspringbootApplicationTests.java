package com.woniuxy.myspringboot;


import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.woniuxy.myspringboot.entity.Stu;
import com.woniuxy.myspringboot.entity.TbArea;
import com.woniuxy.myspringboot.entity.TbCountry;
import com.woniuxy.myspringboot.entity.TbCountryExample;
import com.woniuxy.myspringboot.mapper.StuMapper;
import com.woniuxy.myspringboot.mapper.TbAreaMapper;
import com.woniuxy.myspringboot.mapper.TbCountryMapper;
import com.woniuxy.myspringboot.service.StuService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringbootApplicationTests {
//	@Autowired
//	StuMapper stuMapper;
//	@Autowired
//	StuService stuService;
//	@Autowired
//	DataSource a;
	@Autowired
	TbAreaMapper tbAreaMapper;
	TbArea tbArea;
	@Autowired
	TbCountryMapper tbCountryMapper;
	TbCountry tbCountry;
	@Test
public void contextLoads() {
	tbAreaMapper.insert(new TbArea(1,"四川"));
	
	}
	@Test
	public void contextLoads1() {
		tbCountryMapper.insert(new TbCountry("成都", 1, 1));
		
		}
	@Test
	public void contextLoads2() {
		TbArea tbArea = tbAreaMapper.selectByPrimaryKey(1);
		TbCountryExample example=new TbCountryExample();
		example.createCriteria().andAreaIdEqualTo(tbArea.getAreaId());
		List<TbCountry> tbCountries = tbCountryMapper.selectByExample(example);
		tbArea.setTbCountry(tbCountries);
		System.out.println(tbArea);
		}
}
