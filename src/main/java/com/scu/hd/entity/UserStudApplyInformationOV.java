package com.scu.hd.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * user与StudApplyInformation的联合文件
 */
public class UserStudApplyInformationOV {
    
    private User user;
    private StudApplyInformation studApplyInformation;
    public UserStudApplyInformationOV(){

    }
    public UserStudApplyInformationOV(User user, StudApplyInformation studApplyInformation){
        this.user = user;
        this.studApplyInformation = studApplyInformation;
    }

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
