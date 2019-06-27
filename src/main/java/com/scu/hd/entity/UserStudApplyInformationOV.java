package com.scu.hd.entity;

/**
 * user与StudApplyInformation的联合文件
 */
public class UserStudApplyInformationOV {
    private User user;
    private StudApplyInformation studApplyInformation;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public StudApplyInformation getStudApplyInformation() {
        return studApplyInformation;
    }

    public void setStudApplyInformation(StudApplyInformation studApplyInformation) {
        this.studApplyInformation = studApplyInformation;
    }
}
