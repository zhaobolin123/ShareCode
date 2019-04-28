package com.ssm.yingjia.po;

public class Business {
    private Integer busId;

    private String busName;

    private String busPhone;

    private String busPassword;

    private String busLoc;

    private Integer busLevel;

    private String busContact;

    private String busIntroduction;

    private String busPic;

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName == null ? null : busName.trim();
    }

    public String getBusPhone() {
        return busPhone;
    }

    public void setBusPhone(String busPhone) {
        this.busPhone = busPhone == null ? null : busPhone.trim();
    }

    public String getBusPassword() {
        return busPassword;
    }

    public void setBusPassword(String busPassword) {
        this.busPassword = busPassword == null ? null : busPassword.trim();
    }

    public String getBusLoc() {
        return busLoc;
    }

    public void setBusLoc(String busLoc) {
        this.busLoc = busLoc == null ? null : busLoc.trim();
    }

    public Integer getBusLevel() {
        return busLevel;
    }

    public void setBusLevel(Integer busLevel) {
        this.busLevel = busLevel;
    }

    public String getBusContact() {
        return busContact;
    }

    public void setBusContact(String busContact) {
        this.busContact = busContact == null ? null : busContact.trim();
    }

    public String getBusIntroduction() {
        return busIntroduction;
    }

    public void setBusIntroduction(String busIntroduction) {
        this.busIntroduction = busIntroduction == null ? null : busIntroduction.trim();
    }

    public String getBusPic() {
        return busPic;
    }

    public void setBusPic(String busPic) {
        this.busPic = busPic == null ? null : busPic.trim();
    }
}