package com.scu.hd.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:21
 */
public class SchloarShip {


    int scholarshipId;

    String schoName;

    String schoTime;

    int schoMoney;

    int schoQuota;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8")
    Date schoStartTime;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8")
    Date schoDeadline;

    public SchloarShip(int scholarshipId, String schoName, String schoTime, int schoMoney, int schoQuota, Date schoStartTime, Date schoDeadline) {
        this.scholarshipId = scholarshipId;
        this.schoName = schoName;
        this.schoTime = schoTime;
        this.schoMoney = schoMoney;
        this.schoQuota = schoQuota;
        this.schoStartTime = schoStartTime;
        this.schoDeadline = schoDeadline;
    }

    public SchloarShip(String schoName, String schoTime, int schoMoney, int schoQuota, Date schoStartTime, Date schoDeadline) {
        this.schoName = schoName;
        this.schoTime = schoTime;
        this.schoMoney = schoMoney;
        this.schoQuota = schoQuota;
        this.schoStartTime = schoStartTime;
        this.schoDeadline = schoDeadline;
    }

    @Override
    public String toString() {
        return "SchloarShip{" +
                "scholarshipId=" + scholarshipId +
                ", schoName='" + schoName + '\'' +
                ", schoTime='" + schoTime + '\'' +
                ", schoMoney=" + schoMoney +
                ", schoQuota=" + schoQuota +
                ", schoStartTime=" + schoStartTime +
                ", schoDeadline=" + schoDeadline +
                '}';
    }

    public SchloarShip() {
    }

    public int getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getSchoName() {
        return schoName;
    }

    public void setSchoName(String schoName) {
        this.schoName = schoName;
    }

    public String getSchoTime() {
        return schoTime;
    }

    public void setSchoTime(String schoTime) {
        this.schoTime = schoTime;
    }

    public int getSchoMoney() {
        return schoMoney;
    }

    public void setSchoMoney(int schoMoney) {
        this.schoMoney = schoMoney;
    }

    public int getSchoQuota() {
        return schoQuota;
    }

    public void setSchoQuota(int schoQuota) {
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
