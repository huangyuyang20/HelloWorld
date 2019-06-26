package com.scu.hd.Entity;

import java.util.Date;

public class Employee {
    private String emName;
    private String emId;
    private int emSalary;
    private String emAppraise;
    private Date emBirthday;
    private String emBirthplace;
    private String emPhone;
    private String emIdCard;
    private String emImage;
    private String emNation;
    private String emDepartment;
    private String emPosition;

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getEmId() {
        return emId;
    }

    public void setEmId(String emId) {
        this.emId = emId;
    }

    public int getEmSalary() {
        return emSalary;
    }

    public void setEmSalary(int emSalary) {
        this.emSalary = emSalary;
    }

    public String getEmAppraise() {
        return emAppraise;
    }

    public void setEmAppraise(String emAppraise) {
        this.emAppraise = emAppraise;
    }

    public Date getEmBirthday() {
        return emBirthday;
    }

    public void setEmBirthday(Date emBirthday) {
        this.emBirthday = emBirthday;
    }

    public String getEmBirthplace() {
        return emBirthplace;
    }

    public void setEmBirthplace(String emBirthplace) {
        this.emBirthplace = emBirthplace;
    }

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
        this.emPhone = emPhone;
    }

    public String getEmIdCard() {
        return emIdCard;
    }

    public void setEmIdCard(String emIdCard) {
        this.emIdCard = emIdCard;
    }

    public String getEmImage() {
        return emImage;
    }

    public void setEmImage(String emImage) {
        this.emImage = emImage;
    }

    public String getEmNation() {
        return emNation;
    }

    public void setEmNation(String emNation) {
        this.emNation = emNation;
    }

    public String getEmDepartment() {
        return emDepartment;
    }

    public void setEmDepartment(String emDepartment) {
        this.emDepartment = emDepartment;
    }

    public String getEmPosition() {
        return emPosition;
    }

    public void setEmPosition(String emPosition) {
        this.emPosition = emPosition;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emName='" + emName + '\'' +
                ", emId='" + emId + '\'' +
                ", emSalary=" + emSalary +
                ", emAppraise='" + emAppraise + '\'' +
                ", emBirthday=" + emBirthday +
                ", emBirthplace='" + emBirthplace + '\'' +
                ", emPhone='" + emPhone + '\'' +
                ", emIdCard='" + emIdCard + '\'' +
                ", emImage='" + emImage + '\'' +
                ", emNation='" + emNation + '\'' +
                ", emDepartment='" + emDepartment + '\'' +
                ", emPosition='" + emPosition + '\'' +
                '}';
    }

    public Employee(String emName, String emId, int emSalary, String emAppraise, Date emBirthday, String emBirthplace, String emPhone, String emIdCard, String emImage, String emNation, String emDepartment, String emPosition) {
        this.emName = emName;
        this.emId = emId;
        this.emSalary = emSalary;
        this.emAppraise = emAppraise;
        this.emBirthday = emBirthday;
        this.emBirthplace = emBirthplace;
        this.emPhone = emPhone;
        this.emIdCard = emIdCard;
        this.emImage = emImage;
        this.emNation = emNation;
        this.emDepartment = emDepartment;
        this.emPosition = emPosition;
    }

    public Employee() {
    }
}
