package com.scu.hd.entity;

import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-27-19:10
 */
public class ScholarShip {
    Integer scholarShipId;

    String shoName;

    Integer schoTime;

    Integer schoMoney;

    Integer schoQuota;

    Date schoStartTime;

    Date schoDeadline;

    @Override
    public String toString() {
        return "ScholarShip{" +
                "scholarShipId=" + scholarShipId +
                ", shoName='" + shoName + '\'' +
                ", schoTime=" + schoTime +
                ", schoMoney=" + schoMoney +
                ", schoQuota=" + schoQuota +
                ", schoStartTime=" + schoStartTime +
                ", schoDeadline=" + schoDeadline +
                '}';
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
}
