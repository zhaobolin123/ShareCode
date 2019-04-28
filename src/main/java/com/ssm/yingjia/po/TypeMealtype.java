package com.ssm.yingjia.po;

public class TypeMealtype {
    private Integer mealtypeId;

    private Integer menuId;

    private String mealtypeName;

    private Integer mealtypeType;

    public Integer getMealtypeId() {
        return mealtypeId;
    }

    public void setMealtypeId(Integer mealtypeId) {
        this.mealtypeId = mealtypeId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMealtypeName() {
        return mealtypeName;
    }

    public void setMealtypeName(String mealtypeName) {
        this.mealtypeName = mealtypeName == null ? null : mealtypeName.trim();
    }

    public Integer getMealtypeType() {
        return mealtypeType;
    }

    public void setMealtypeType(Integer mealtypeType) {
        this.mealtypeType = mealtypeType;
    }
}