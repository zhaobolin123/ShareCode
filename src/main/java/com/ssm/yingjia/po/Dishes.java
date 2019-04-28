package com.ssm.yingjia.po;

public class Dishes {
    private Integer dishesId;

    private String dishesName;

    private Integer dishesProtein;

    private Integer dishesFat;

    private Integer dishesCarbohydrate;

    private String dishesPic;

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName == null ? null : dishesName.trim();
    }

    public Integer getDishesProtein() {
        return dishesProtein;
    }

    public void setDishesProtein(Integer dishesProtein) {
        this.dishesProtein = dishesProtein;
    }

    public Integer getDishesFat() {
        return dishesFat;
    }

    public void setDishesFat(Integer dishesFat) {
        this.dishesFat = dishesFat;
    }

    public Integer getDishesCarbohydrate() {
        return dishesCarbohydrate;
    }

    public void setDishesCarbohydrate(Integer dishesCarbohydrate) {
        this.dishesCarbohydrate = dishesCarbohydrate;
    }

    public String getDishesPic() {
        return dishesPic;
    }

    public void setDishesPic(String dishesPic) {
        this.dishesPic = dishesPic == null ? null : dishesPic.trim();
    }
}