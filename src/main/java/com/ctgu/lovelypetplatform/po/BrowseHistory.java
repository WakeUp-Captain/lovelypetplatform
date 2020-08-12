package com.ctgu.lovelypetplatform.po;

public class BrowseHistory {
    private Integer recordid;
    private Integer good_num;
    private String telenum;
    private Pets pet;

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Integer getGood_num() {
        return good_num;
    }

    public void setGood_num(Integer good_num) {
        this.good_num = good_num;
    }

    public String getTelenum() {
        return telenum;
    }

    public void setTelenum(String telenum) {
        this.telenum = telenum;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }
}
