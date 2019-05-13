package com.bw.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable{
    private Long roleId;

    private String roleCode;

    private String roleName;

    private Byte roleFlag;

    private Byte roleDelete;

    private Date updateTime;

    private Long updateBy;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Byte getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(Byte roleFlag) {
        this.roleFlag = roleFlag;
    }

    public Byte getRoleDelete() {
        return roleDelete;
    }

    public void setRoleDelete(Byte roleDelete) {
        this.roleDelete = roleDelete;
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