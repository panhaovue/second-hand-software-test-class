package cn.edu.hrbeu.secondhandsoftwaretestclass.bean;

import java.util.Date;

public class Commodity {
    private Integer commodityId;
    private String commodityName;
    private Integer commodityKind;
    private Double commodityPrice;
    private String commodityDetail;
    private String contactWay;
    private String commodityPicture;
    private Integer userId;
    private Date commodityTime;
    private Date commodityDeadline;

    public Date getCommodityTime() {
        return commodityTime;
    }

    public Date getCommodityDeadline() {
        return commodityDeadline;
    }

    public void setCommodityTime(Date commodityTime) {
        this.commodityTime = commodityTime;
    }

    public void setCommodityDeadline(Date commodityDeadline) {
        this.commodityDeadline = commodityDeadline;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityKind() {
        return commodityKind;
    }

    public void setCommodityKind(Integer commodityKind) {
        this.commodityKind = commodityKind;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityDetail() {
        return commodityDetail;
    }

    public void setCommodityDetail(String commodityDetail) {
        this.commodityDetail = commodityDetail;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getCommodityPicture() {
        return commodityPicture;
    }

    public void setCommodityPicture(String commodityPicture) {
        this.commodityPicture = commodityPicture;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
