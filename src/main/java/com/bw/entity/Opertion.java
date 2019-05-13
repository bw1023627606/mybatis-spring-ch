package com.bw.entity;

import java.io.Serializable;

public class Opertion implements Serializable{
    private Long opertionId;

    private String opertionCode;

    private String opertionName;

    private String opertionUrl;

    private Long opertionParentId;

    public Long getOpertionId() {
        return opertionId;
    }

    public void setOpertionId(Long opertionId) {
        this.opertionId = opertionId;
    }

    public String getOpertionCode() {
        return opertionCode;
    }

    public void setOpertionCode(String opertionCode) {
        this.opertionCode = opertionCode == null ? null : opertionCode.trim();
    }

    public String getOpertionName() {
        return opertionName;
    }

    public void setOpertionName(String opertionName) {
        this.opertionName = opertionName == null ? null : opertionName.trim();
    }

    public String getOpertionUrl() {
        return opertionUrl;
    }

    public void setOpertionUrl(String opertionUrl) {
        this.opertionUrl = opertionUrl == null ? null : opertionUrl.trim();
    }

    public Long getOpertionParentId() {
        return opertionParentId;
    }

    public void setOpertionParentId(Long opertionParentId) {
        this.opertionParentId = opertionParentId;
    }
}