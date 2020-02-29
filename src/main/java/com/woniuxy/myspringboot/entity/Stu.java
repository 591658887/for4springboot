package com.woniuxy.myspringboot.entity;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@ConfigurationProperties(prefix="student")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stu {
	private Integer sid;
	private String sname;
	private Integer age;
	private Date date;

	
}
