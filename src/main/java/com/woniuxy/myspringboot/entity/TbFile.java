package com.woniuxy.myspringboot.entity;

import java.util.Date;

public class TbFile {
    private Integer fileId;

    private Date fileTime;

    private String fileName;

    private String fileUrl;

    private Integer fileTypeId;

    private Integer fileLoaderId;

    private Integer moduleId;

    private Integer fileTxId;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Date getFileTime() {
        return fileTime;
    }

    public void setFileTime(Date fileTime) {
        this.fileTime = fileTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Integer getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Integer fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public Integer getFileLoaderId() {
        return fileLoaderId;
    }

    public void setFileLoaderId(Integer fileLoaderId) {
        this.fileLoaderId = fileLoaderId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getFileTxId() {
        return fileTxId;
    }

    public void setFileTxId(Integer fileTxId) {
        this.fileTxId = fileTxId;
    }
}