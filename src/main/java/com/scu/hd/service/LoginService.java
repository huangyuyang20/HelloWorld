package com.scu.hd.service;

import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.entity.User;
import com.scu.hd.entity.UserStudApplyInformationOV;

public interface LoginService {
    /**
     * 插入User+StudApplyInformation
     */
    public void insertUserStudentOV(UserStudApplyInformationOV user);

    public void insertStudApplyInformation(StudApplyInformation studApplyInformation);

    public StudApplyInformation selectStudApplyInformationById(String userId);

    /**
     * 查询user
     */
    public User selectUserById(String userId);
}
