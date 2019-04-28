package com.ssm.yingjia.po;

public class BusinessDishes {
    private Integer businessDishesId;

    private Integer busId;

    private Integer dishesId;

    private Integer specialLevel;

    private Integer qualityLevel;

    private String businessDishesPic;

    public Integer getBusinessDishesId() {
        return businessDishesId;
    }

    public void setBusinessDishesId(Integer businessDishesId) {
        this.businessDishesId = businessDishesId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    public Integer getSpecialLevel() {
        return specialLevel;
    }

    public void setSpecialLevel(Integer specialLevel) {
        this.specialLevel = specialLevel;
    }

    public Integer getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(Integer qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getBusinessDishesPic() {
        return businessDishesPic;
    }

    public void setBusinessDishesPic(String businessDishesPic) {
        this.businessDishesPic = businessDishesPic == null ? null : businessDishesPic.trim();
    }
}