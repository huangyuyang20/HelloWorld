package com.scu.hd.service;

import com.scu.hd.entity.User;
import com.scu.hd.entity.UserStudApplyInformationOV;

public interface LoginService {
    /**
     * 插入User+StudApplyInformation
     */
    public void insertUserStudentOV(UserStudApplyInformationOV user);

    /**
     * 查询user
     */
    public User selectUserById(String userId);
}
