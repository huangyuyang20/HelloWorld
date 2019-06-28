package com.scu.hd.dao;

import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.entity.Student;
import com.scu.hd.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    public void insertUser(User user);

    public User selectUserById(String userId);

    public void insertStudApplyInformation(StudApplyInformation studApplyInformation);

    public StudApplyInformation selectStudApplyInformationById(String userId);
}
