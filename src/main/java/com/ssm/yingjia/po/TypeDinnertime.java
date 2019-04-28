package com.ssm.yingjia.po;

public class TypeDinnertime {
    private Integer dinnertimeId;

    private Integer menuId;

    private String dinnertimeName;

    private Integer dinnertimeType;

    public Integer getDinnertimeId() {
        return dinnertimeId;
    }

    public void setDinnertimeId(Integer dinnertimeId) {
        this.dinnertimeId = dinnertimeId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getDinnertimeName() {
        return dinnertimeName;
    }

    public void setDinnertimeName(String dinnertimeName) {
        this.dinnertimeName = dinnertimeName == null ? null : dinnertimeName.trim();
    }

    public Integer getDinnertimeType() {
        return dinnertimeType;
    }

    public void setDinnertimeType(Integer dinnertimeType) {
        this.dinnertimeType = dinnertimeType;
    }
}