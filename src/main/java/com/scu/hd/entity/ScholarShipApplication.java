package com.scu.hd.entity;


import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:36
 */

public class ScholarShipApplication {

    private int scholarshipId;//奖项编号

    private int stuId;//学生id

    private String schoPersonalstmt;//个人陈述

    private int schoApprove;//审核状态

   private Date schoApprovetime;//申请时间

   private Date  schoSubmittime;//确认时间

    @Override
    public String toString() {
        return "ScholarShipApplication{" +
                "scholarshipId=" + scholarshipId +
                ", stuId=" + stuId +
                ", schoPersonalstmt='" + schoPersonalstmt + '\'' +
                ", schoApprove=" + schoApprove +
                ", schoApprovetime=" + schoApprovetime +
                ", schoSubmittime=" + schoSubmittime +
                '}';
    }

    public ScholarShipApplication(int scholarshipId, int stuId, String schoPersonalstmt, int schoApprove, Date schoApprovetime, Date schoSubmittime) {
        this.scholarshipId = scholarshipId;
        this.stuId = stuId;
        this.schoPersonalstmt = schoPersonalstmt;
        this.schoApprove = schoApprove;
        this.schoApprovetime = schoApprovetime;
        this.schoSubmittime = schoSubmittime;
    }

    public ScholarShipApplication() {
    }

    public int getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getSchoPersonalstmt() {
        return schoPersonalstmt;
    }

    public void setSchoPersonalstmt(String schoPersonalstmt) {
        this.schoPersonalstmt = schoPersonalstmt;
    }

    public int getSchoApprove() {
        return schoApprove;
    }

    public void setSchoApprove(int schoApprove) {
        this.schoApprove = schoApprove;
    }

    public Date getSchoApprovetime() {
        return schoApprovetime;
    }

    public void setSchoApprovetime(Date schoApprovetime) {
        this.schoApprovetime = schoApprovetime;
    }

    public Date getSchoSubmittime() {
        return schoSubmittime;
    }

    public void setSchoSubmittime(Date schoSubmittime) {
        this.schoSubmittime = schoSubmittime;
    }
}
