package com.scu.hd.entity;

import java.util.Date;

/**
 * @author hyy
 * @date 2019/6/27 15:33
 */
public class ScholarApplicationInformation {
    private String schoName;

    private String schoTime;

    private int scholarshipId;//奖项编号

    private String stuId;//学生id

    private String schoPersonnalStmt;

    private int schoApprove;//审核状态

    private Date schoApprovetime;//申请时间

    public String getSchoPersonnalStmt() {
        return schoPersonnalStmt;
    }

    public void setSchoPersonnalStmt(String schoPersonnalStmt) {
        this.schoPersonnalStmt = schoPersonnalStmt;
    }

    public ScholarApplicationInformation(String schoName, String schoTime, int scholarshipId, String stuId, String schoPersonnalStmt, int schoApprove, Date schoApprovetime) {
        this.schoName = schoName;
        this.schoTime = schoTime;
        this.scholarshipId = scholarshipId;
        this.stuId = stuId;
        this.schoPersonnalStmt = schoPersonnalStmt;
        this.schoApprove = schoApprove;
        this.schoApprovetime = schoApprovetime;
    }

    public ScholarApplicationInformation() {
    }

    @Override
    public String toString() {
        return "ScholarApplicationInformation{" +
                "schoName='" + schoName + '\'' +
                ", schoTime='" + schoTime + '\'' +
                ", scholarshipId=" + scholarshipId +
                ", stuId='" + stuId + '\'' +
                ", schoPersonnalStmt='" + schoPersonnalStmt + '\'' +
                ", schoApprove=" + schoApprove +
                ", schoApprovetime=" + schoApprovetime +
                '}';
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

    public int getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
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
}
