package com.woniuxy.myspringboot.entity;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@NoArgsConstructor

public class TbArea {
    private Integer areaId;

    private String areaName;
    private List<TbCountry>tbCountry;
    
//    public TbArea() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//    
	public TbArea(Integer areaId, String areaName) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
	}
//
//	public Integer getAreaId() {
//        return areaId;
//    }
//
//    public void setAreaId(Integer areaId) {
//        this.areaId = areaId;
//    }
//
//    public String getAreaName() {
//        return areaName;
//    }
//
//    public void setAreaName(String areaName) {
//        this.areaName = areaName == null ? null : areaName.trim();
//    }
//
//	@Override
//	public String toString() {
//		return "TbArea [areaId=" + areaId + ", areaName=" + areaName + "]";
	//}
    
}