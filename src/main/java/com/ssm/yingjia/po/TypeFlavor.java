package com.ssm.yingjia.po;

public class TypeFlavor {
    private Integer flavorId;

    private Integer menuId;

    private String flavorName;

    private Integer flavorType;

    public Integer getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(Integer flavorId) {
        this.flavorId = flavorId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName == null ? null : flavorName.trim();
    }

    public Integer getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(Integer flavorType) {
        this.flavorType = flavorType;
    }
}