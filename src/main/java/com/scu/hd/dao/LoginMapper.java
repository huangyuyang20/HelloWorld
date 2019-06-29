package com.scu.hd.dao;

import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginMapper {

    public void insertUser(User user);

    public User selectUserById(String userId);

    public void insertStudApplyInformation(StudApplyInformation studApplyInformation);

    public void updateStudApplyInformation(StudApplyInformation studApplyInformation);

    public List<StudApplyInformation> selectStudApplyInformation();


    public List<StudApplyInformation> manager1GetInformation();


    public List<StudApplyInformation> manager2GetInformation();


    public List<StudApplyInformation> manager3GetInformation();


    public List<StudApplyInformation> studentGetInformation();


    public StudApplyInformation getMyApplyInformation(String userId);


    public List<StudApplyInformation> finalOutcome();


    public StudApplyInformation selectStudApplyInformationById(String userId);
}
