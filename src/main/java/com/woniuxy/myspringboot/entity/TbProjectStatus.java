package com.woniuxy.myspringboot.entity;

public class TbProjectStatus {
    private Integer projectStatusId;

    private String projectStatusName;

    public Integer getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Integer projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public String getProjectStatusName() {
        return projectStatusName;
    }

    public void setProjectStatusName(String projectStatusName) {
        this.projectStatusName = projectStatusName == null ? null : projectStatusName.trim();
    }
}