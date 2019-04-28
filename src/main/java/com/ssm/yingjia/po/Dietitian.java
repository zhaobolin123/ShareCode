package com.ssm.yingjia.po;

import java.util.Date;

public class Dietitian {
    private Integer dietitianId;

    private String dietitianNickname;

    private String dietitianPhone;

    private String dietitianPassword;

    private Integer dietitianNumber;

    private String dietitianName;

    private Integer dietitianLevel;

    private Integer wallet;

    private String dietitianPic;

    private Date dietitianTime;

    public Integer getDietitianId() {
        return dietitianId;
    }

    public void setDietitianId(Integer dietitianId) {
        this.dietitianId = dietitianId;
    }

    public String getDietitianNickname() {
        return dietitianNickname;
    }

    public void setDietitianNickname(String dietitianNickname) {
        this.dietitianNickname = dietitianNickname == null ? null : dietitianNickname.trim();
    }

    public String getDietitianPhone() {
        return dietitianPhone;
    }

    public void setDietitianPhone(String dietitianPhone) {
        this.dietitianPhone = dietitianPhone == null ? null : dietitianPhone.trim();
    }

    public String getDietitianPassword() {
        return dietitianPassword;
    }

    public void setDietitianPassword(String dietitianPassword) {
        this.dietitianPassword = dietitianPassword == null ? null : dietitianPassword.trim();
    }

    public Integer getDietitianNumber() {
        return dietitianNumber;
    }

    public void setDietitianNumber(Integer dietitianNumber) {
        this.dietitianNumber = dietitianNumber;
    }

    public String getDietitianName() {
        return dietitianName;
    }

    public void setDietitianName(String dietitianName) {
        this.dietitianName = dietitianName == null ? null : dietitianName.trim();
    }

    public Integer getDietitianLevel() {
        return dietitianLevel;
    }

    public void setDietitianLevel(Integer dietitianLevel) {
        this.dietitianLevel = dietitianLevel;
    }

    public Integer getWallet() {
        return wallet;
    }

    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }

    public String getDietitianPic() {
        return dietitianPic;
    }

    public void setDietitianPic(String dietitianPic) {
        this.dietitianPic = dietitianPic == null ? null : dietitianPic.trim();
    }

    public Date getDietitianTime() {
        return dietitianTime;
    }

    public void setDietitianTime(Date dietitianTime) {
        this.dietitianTime = dietitianTime;
    }
}