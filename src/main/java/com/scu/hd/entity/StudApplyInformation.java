package com.scu.hd.entity;

import java.util.Date;

/**
 * @author hyy
 * @date 2019/6/26 19:03
 */
public class StudApplyInformation {
    private String stuName;
    private Date stuBirthday;
    private String stuBirthplace;
    private String stuEmail;
    private String stuGender;
    private String stuMajor;
    private String stuPhone;
    private String stuIdCard;
    private String stuIntroduction;
    private int stuGrade;
    private int stuLevel1manager;
    private int stuLevel2manager;
    private int stuLevel3manager;
    private int stuSelfcheck;
    private String stuNation;
    private String stuImage;
    private int stuApplyId;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuBirthplace() {
        return stuBirthplace;
    }

    public void setStuBirthplace(String stuBirthplace) {
        this.stuBirthplace = stuBirthplace;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuIdCard() {
        return stuIdCard;
    }

    public void setStuIdCard(String stuIdCard) {
        this.stuIdCard = stuIdCard;
    }

    public String getStuIntroduction() {
        return stuIntroduction;
    }

    public void setStuIntroduction(String stuIntroduction) {
        this.stuIntroduction = stuIntroduction;
    }

    public int getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public int getStuLevel1manager() {
        return stuLevel1manager;
    }

    public void setStuLevel1manager(int stuLevel1manager) {
        this.stuLevel1manager = stuLevel1manager;
    }

    public int getStuLevel2manager() {
        return stuLevel2manager;
    }

    public void setStuLevel2manager(int stuLevel2manager) {
        this.stuLevel2manager = stuLevel2manager;
    }

    public int getStuLevel3manager() {
        return stuLevel3manager;
    }

    public void setStuLevel3manager(int stuLevel3manager) {
        this.stuLevel3manager = stuLevel3manager;
    }

    public int getStuSelfcheck() {
        return stuSelfcheck;
    }

    public void setStuSelfcheck(int stuSelfcheck) {
        this.stuSelfcheck = stuSelfcheck;
    }

    public String getStuNation() {
        return stuNation;
    }

    public void setStuNation(String stuNation) {
        this.stuNation = stuNation;
    }

    public String getStuImage() {
        return stuImage;
    }

    public void setStuImage(String stuImage) {
        this.stuImage = stuImage;
    }

    public int getStuApplyId() {
        return stuApplyId;
    }

    public void setStuApplyId(int stuApplyId) {
        this.stuApplyId = stuApplyId;
    }

    public StudApplyInformation() {
    }

    @Override
    public String toString() {
        return "StudApplyInformation{" +
                "userId='" + userId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuBirthday=" + stuBirthday +
                ", stuBirthplace='" + stuBirthplace + '\'' +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuMajor='" + stuMajor + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                ", stuIdCard='" + stuIdCard + '\'' +
                ", stuIntroduction='" + stuIntroduction + '\'' +
                ", stuGrade=" + stuGrade +
                ", stuLevel1manager=" + stuLevel1manager +
                ", stuLevel2manager=" + stuLevel2manager +
                ", stuLevel3manager=" + stuLevel3manager +
                ", stuSelfcheck=" + stuSelfcheck +
                ", stuNation='" + stuNation + '\'' +
                ", stuImage='" + stuImage + '\'' +
                ", stuApplyId=" + stuApplyId +
                '}';
    }

    public StudApplyInformation(String stuName, Date stuBirthday, String stuBirthplace, String stuEmail, String stuMajor, String stuPhone, String stuIdCard, String stuIntroduction, int stuGrade, int stuLevel1manager, int stuLevel2manager, int stuLevel3manager, int stuSelfcheck, String stuNation, String stuImage, int stuApplyId) {
        this.stuName = stuName;
        this.stuBirthday = stuBirthday;
        this.stuBirthplace = stuBirthplace;
        this.stuEmail = stuEmail;
        this.stuMajor = stuMajor;
        this.stuPhone = stuPhone;
        this.stuIdCard = stuIdCard;
        this.stuIntroduction = stuIntroduction;
        this.stuGrade = stuGrade;
        this.stuLevel1manager = stuLevel1manager;
        this.stuLevel2manager = stuLevel2manager;
        this.stuLevel3manager = stuLevel3manager;
        this.stuSelfcheck = stuSelfcheck;
        this.stuNation = stuNation;
        this.stuImage = stuImage;
        this.stuApplyId = stuApplyId;
    }
}
