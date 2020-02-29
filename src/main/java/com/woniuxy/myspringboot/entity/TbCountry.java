package com.woniuxy.myspringboot.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Component
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class TbCountry {

    private String countyName;

    private Integer countyId;

    private Integer areaId;
    
    public TbCountry(String countyName, Integer countyId, Integer areaId) {
		super();
		this.countyName = countyName;
		this.countyId = countyId;
		this.areaId = areaId;
	}

	public TbCountry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

	@Override
	public String toString() {
		return "TbCountry [countyName=" + countyName + ", countyId=" + countyId + ", areaId=" + areaId + "]";
	}
    
}