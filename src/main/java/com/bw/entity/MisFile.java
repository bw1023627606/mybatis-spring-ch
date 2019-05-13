package com.bw.entity;

import java.io.Serializable;

public class MisFile implements Serializable{
    private Long fileId;

    private String fileCode;

    private String fileName;

    private String fliePath;

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode == null ? null : fileCode.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFliePath() {
        return fliePath;
    }

    public void setFliePath(String fliePath) {
        this.fliePath = fliePath == null ? null : fliePath.trim();
    }
}