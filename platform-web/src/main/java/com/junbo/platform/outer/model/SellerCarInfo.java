package com.junbo.platform.outer.model;

import java.util.Date;

public class SellerCarInfo {
    private Integer id;

    private String wxUserId;

    private String telephone;

    private String city;

    private String brand;

    private String mileage;

    private Integer licsenceDate;

    private Date createTime;

    private Boolean isContacted;

    private Date contactedTime;

    private String picUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Integer getLicsenceDate() {
        return licsenceDate;
    }

    public void setLicsenceDate(Integer licsenceDate) {
        this.licsenceDate = licsenceDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsContacted() {
        return isContacted;
    }

    public void setIsContacted(Boolean isContacted) {
        this.isContacted = isContacted;
    }

    public Date getContactedTime() {
        return contactedTime;
    }

    public void setContactedTime(Date contactedTime) {
        this.contactedTime = contactedTime;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}