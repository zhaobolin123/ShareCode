package com.ssm.yingjia.po;

public class TypeDrink {
    private Integer drinkId;

    private Integer menuId;

    private String drinkName;

    private Integer drinkType;

    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName == null ? null : drinkName.trim();
    }

    public Integer getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(Integer drinkType) {
        this.drinkType = drinkType;
    }
}