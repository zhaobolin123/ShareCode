package com.ssm.yingjia.po;

public class TypeAllergen {
    private Integer allergenId;

    private Integer menuId;

    private String allergenName;

    private Integer allergenType;

    public Integer getAllergenId() {
        return allergenId;
    }

    public void setAllergenId(Integer allergenId) {
        this.allergenId = allergenId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getAllergenName() {
        return allergenName;
    }

    public void setAllergenName(String allergenName) {
        this.allergenName = allergenName == null ? null : allergenName.trim();
    }

    public Integer getAllergenType() {
        return allergenType;
    }

    public void setAllergenType(Integer allergenType) {
        this.allergenType = allergenType;
    }
}