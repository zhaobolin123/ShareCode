package com.ssm.yingjia.po;

public class Ingredients {
    private Integer ingreId;

    private String ingreName;

    private Integer ingreProtein;

    private Integer ingreFat;

    private Integer ingreCarbohydrate;

    public Integer getIngreId() {
        return ingreId;
    }

    public void setIngreId(Integer ingreId) {
        this.ingreId = ingreId;
    }

    public String getIngreName() {
        return ingreName;
    }

    public void setIngreName(String ingreName) {
        this.ingreName = ingreName == null ? null : ingreName.trim();
    }

    public Integer getIngreProtein() {
        return ingreProtein;
    }

    public void setIngreProtein(Integer ingreProtein) {
        this.ingreProtein = ingreProtein;
    }

    public Integer getIngreFat() {
        return ingreFat;
    }

    public void setIngreFat(Integer ingreFat) {
        this.ingreFat = ingreFat;
    }

    public Integer getIngreCarbohydrate() {
        return ingreCarbohydrate;
    }

    public void setIngreCarbohydrate(Integer ingreCarbohydrate) {
        this.ingreCarbohydrate = ingreCarbohydrate;
    }
}