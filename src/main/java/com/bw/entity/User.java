package com.bw.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private Long userId;

    private String userName;

    private String passWord;

    private Byte userFlag;

    private Byte userDelete;

    private Date updateTime;

    private Long updateBy;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Byte getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Byte userFlag) {
        this.userFlag = userFlag;
    }

    public Byte getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(Byte userDelete) {
        this.userDelete = userDelete;
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", userFlag=" + userFlag
				+ ", userDelete=" + userDelete + ", updateTime=" + updateTime + ", updateBy=" + updateBy + "]";
	}
    
    
}