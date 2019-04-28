package com.ssm.yingjia.po;

public class TypeConstitution {
    private Integer constitutionId;

    private Integer menuId;

    private String constitutionName;

    private Integer constitutionType;

    public Integer getConstitutionId() {
        return constitutionId;
    }

    public void setConstitutionId(Integer constitutionId) {
        this.constitutionId = constitutionId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getConstitutionName() {
        return constitutionName;
    }

    public void setConstitutionName(String constitutionName) {
        this.constitutionName = constitutionName == null ? null : constitutionName.trim();
    }

    public Integer getConstitutionType() {
        return constitutionType;
    }

    public void setConstitutionType(Integer constitutionType) {
        this.constitutionType = constitutionType;
    }
}