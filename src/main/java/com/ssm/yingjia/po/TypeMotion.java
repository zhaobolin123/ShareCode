package com.ssm.yingjia.po;

public class TypeMotion {
    private Integer motionId;

    private Integer menuId;

    private String motionName;

    private Integer motionType;

    public Integer getMotionId() {
        return motionId;
    }

    public void setMotionId(Integer motionId) {
        this.motionId = motionId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMotionName() {
        return motionName;
    }

    public void setMotionName(String motionName) {
        this.motionName = motionName == null ? null : motionName.trim();
    }

    public Integer getMotionType() {
        return motionType;
    }

    public void setMotionType(Integer motionType) {
        this.motionType = motionType;
    }
}