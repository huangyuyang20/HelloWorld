package com.scu.hd.entity;


import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:21
 */
public class SchloarShip {
    @Override
    public String toString() {
        return "SchloarShip{" +
                "scholarShipId=" + scholarShipId +
                ", shoName='" + shoName + '\'' +
                ", schoTime=" + schoTime +
                ", schoMoney=" + schoMoney +
                ", schoQuota=" + schoQuota +
                ", schoStartTime=" + schoStartTime +
                ", schoDeadline=" + schoDeadline +
                '}';
    }

    Integer scholarShipId;

    public SchloarShip() {
    }

    public SchloarShip(Integer scholarShipId, String shoName, Integer schoTime, Integer schoMoney, Integer schoQuota, Date schoStartTime, Date schoDeadline) {
        this.scholarShipId = scholarShipId;
        this.shoName = shoName;
        this.schoTime = schoTime;
        this.schoMoney = schoMoney;
        this.schoQuota = schoQuota;
        this.schoStartTime = schoStartTime;
        this.schoDeadline = schoDeadline;
    }

    public Integer getScholarShipId() {
        return scholarShipId;
    }

    public void setScholarShipId(Integer scholarShipId) {
        this.scholarShipId = scholarShipId;
    }

    public String getShoName() {
        return shoName;
    }

    public void setShoName(String shoName) {
        this.shoName = shoName;
    }

    public Integer getSchoTime() {
        return schoTime;
    }

    public void setSchoTime(Integer schoTime) {
        this.schoTime = schoTime;
    }

    public Integer getSchoMoney() {
        return schoMoney;
    }

    public void setSchoMoney(Integer schoMoney) {
        this.schoMoney = schoMoney;
    }

    public Integer getSchoQuota() {
        return schoQuota;
    }

    public void setSchoQuota(Integer schoQuota) {
        this.schoQuota = schoQuota;
    }

    public Date getSchoStartTime() {
        return schoStartTime;
    }

    public void setSchoStartTime(Date schoStartTime) {
        this.schoStartTime = schoStartTime;
    }

    public Date getSchoDeadline() {
        return schoDeadline;
    }

    public void setSchoDeadline(Date schoDeadline) {
        this.schoDeadline = schoDeadline;
    }

    String shoName;

    Integer schoTime;

    Integer schoMoney;

    Integer schoQuota;

    Date schoStartTime;

    Date schoDeadline;

}
