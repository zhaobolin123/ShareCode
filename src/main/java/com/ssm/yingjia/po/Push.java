package com.ssm.yingjia.po;

import java.util.Date;

public class Push {
    private Integer pushId;

    private String pushName;

    private Integer pushType;

    private Integer dietitianId;

    private String pushContent;

    private Date pushTime;

    private String dietitian_nickname;

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public String getPushName() {
        return pushName;
    }

    public void setPushName(String pushName) {
        this.pushName = pushName == null ? null : pushName.trim();
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public Integer getDietitianId() {
        return dietitianId;
    }

    public void setDietitianId(Integer dietitianId) {
        this.dietitianId = dietitianId;
    }

    public String getPushContent() {
        return pushContent;
    }

    public void setPushContent(String pushContent) {
        this.pushContent = pushContent == null ? null : pushContent.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public String getDietitian_nickname() {
        return dietitian_nickname;
    }

    public void setDietitian_nickname(String dietitian_nickname) {
        this.dietitian_nickname = dietitian_nickname;
    }
}