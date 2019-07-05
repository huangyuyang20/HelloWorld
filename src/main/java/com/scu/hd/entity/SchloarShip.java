package com.scu.hd.entity;

import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-27-19:10
 */
public class SchloarShip {
    Integer scholarShipId;

    String schoName;

    String schoTime;

    Integer schoMoney;

    Integer schoQuota;

    Date schoStartTime;

    Date schoDeadline;

    @Override
    public String toString() {
        return "ScholarShip{" +
                "scholarShipId=" + scholarShipId +
                ", shoName='" + schoName + '\'' +
                ", schoTime=" + schoTime +
                ", schoMoney=" + schoMoney +
                ", schoQuota=" + schoQuota +
                ", schoStartTime=" + schoStartTime +
                ", schoDeadline=" + schoDeadline +
                '}';
    }



    public String getSchoTime() {
        return schoTime;
    }

    public void setSchoTime(String schoTime) {
        this.schoTime = schoTime;
    }

    public Integer getScholarShipId() {
        return scholarShipId;
    }

    public void setScholarShipId(Integer scholarShipId) {
        this.scholarShipId = scholarShipId;
    }

    public String getSchoName() {
        return schoName;
    }

    public void setSchoName(String schoName) {
        this.schoName = schoName;
    }

    public SchloarShip(){

    }
    public SchloarShip(Integer scholarShipId, String schoName, String schoTime, Integer schoMoney, Integer schoQuota, Date schoStartTime, Date schoDeadline) {
        this.scholarShipId = scholarShipId;
        this.schoName = schoName;
        this.schoTime = schoTime;
        this.schoMoney = schoMoney;
        this.schoQuota = schoQuota;
        this.schoStartTime = schoStartTime;
        this.schoDeadline = schoDeadline;
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
}
