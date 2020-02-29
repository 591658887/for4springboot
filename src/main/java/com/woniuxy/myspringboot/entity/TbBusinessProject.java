package com.woniuxy.myspringboot.entity;

import java.util.Date;

public class TbBusinessProject {
    private Integer businessProjectId;

    private Integer businessProjectCountyId;

    private Integer industryTypeId;

    private Integer projectStatusId;

    private Integer checkStatusId;

    private Integer moduleId;

    private String projectName;

    private String projectContent;

    private Date projectTime;

    public Integer getBusinessProjectId() {
        return businessProjectId;
    }

    public void setBusinessProjectId(Integer businessProjectId) {
        this.businessProjectId = businessProjectId;
    }

    public Integer getBusinessProjectCountyId() {
        return businessProjectCountyId;
    }

    public void setBusinessProjectCountyId(Integer businessProjectCountyId) {
        this.businessProjectCountyId = businessProjectCountyId;
    }

    public Integer getIndustryTypeId() {
        return industryTypeId;
    }

    public void setIndustryTypeId(Integer industryTypeId) {
        this.industryTypeId = industryTypeId;
    }

    public Integer getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Integer projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public Integer getCheckStatusId() {
        return checkStatusId;
    }

    public void setCheckStatusId(Integer checkStatusId) {
        this.checkStatusId = checkStatusId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent == null ? null : projectContent.trim();
    }

    public Date getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(Date projectTime) {
        this.projectTime = projectTime;
    }
}