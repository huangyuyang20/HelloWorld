package com.scu.hd.entity;


import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:39
 */
public class Student {
    Integer stuId;

    String stuName;

    String stuCollege;

    String stuMajor;

    Date stuBirthDate;

    String stuBirthPlace;

    String stuPhone;

    Integer stuGender;

    String stuEmail;

    Integer stuAccount;

    Double stuGpa;

    String stuStatus;

    String stuPassword;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuCollege() {
        return stuCollege;
    }

    public void setStuCollege(String stuCollege) {
        this.stuCollege = stuCollege;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public Date getStuBirthDate() {
        return stuBirthDate;
    }

    public void setStuBirthDate(Date stuBirthDate) {
        this.stuBirthDate = stuBirthDate;
    }

    public String getStuBirthPlace() {
        return stuBirthPlace;
    }

    public void setStuBirthPlace(String stuBirthPlace) {
        this.stuBirthPlace = stuBirthPlace;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public Integer getStuGender() {
        return stuGender;
    }

    public void setStuGender(Integer stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public Integer getStuAccount() {
        return stuAccount;
    }

    public void setStuAccount(Integer stuAccount) {
        this.stuAccount = stuAccount;
    }

    public Double getStuGpa() {
        return stuGpa;
    }

    public void setStuGpa(Double stuGpa) {
        this.stuGpa = stuGpa;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public Student() {
    }

    public Student(Integer stuId, String stuName, String stuCollege, String stuMajor, Date stuBirthDate, String stuBirthPlace, String stuPhone, Integer stuGender, String stuEmail, Integer stuAccount, Double stuGpa, String stuStatus, String stuPassword) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuCollege = stuCollege;
        this.stuMajor = stuMajor;
        this.stuBirthDate = stuBirthDate;
        this.stuBirthPlace = stuBirthPlace;
        this.stuPhone = stuPhone;
        this.stuGender = stuGender;
        this.stuEmail = stuEmail;
        this.stuAccount = stuAccount;
        this.stuGpa = stuGpa;
        this.stuStatus = stuStatus;
        this.stuPassword = stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }
}
