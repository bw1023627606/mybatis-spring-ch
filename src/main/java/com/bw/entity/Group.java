package com.bw.entity;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable{
    private Long groupId;

    private String groupName;

    private String groupCode;

    private Byte groupFlag;

    private Byte groupDelete;

    private Date updateTime;

    private Long updateBy;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public Byte getGroupFlag() {
        return groupFlag;
    }

    public void setGroupFlag(Byte groupFlag) {
        this.groupFlag = groupFlag;
    }

    public Byte getGroupDelete() {
        return groupDelete;
    }

    public void setGroupDelete(Byte groupDelete) {
        this.groupDelete = groupDelete;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }
}