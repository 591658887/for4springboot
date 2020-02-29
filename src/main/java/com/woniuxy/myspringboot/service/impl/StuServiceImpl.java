package com.woniuxy.myspringboot.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.myspringboot.entity.Stu;
import com.woniuxy.myspringboot.mapper.StuMapper;
import com.woniuxy.myspringboot.service.StuService;


@Service
public class StuServiceImpl implements StuService{
	@Autowired
	StuMapper stuMapper;
	@Transactional
	@Override
	public void testTranslation() {
		stuMapper.insertStu(new Stu(2,"2",2,new Date()));
		if(true) {
			throw new RuntimeException();
		}
		stuMapper.insertStu(new Stu(3,"3",3,new Date()));
		
	}


	
}
