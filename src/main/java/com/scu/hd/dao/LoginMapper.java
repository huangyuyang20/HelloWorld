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

    @Select("select * from stu_apply_information")
    public List<StudApplyInformation> manager1GetInformation();

    @Select("select * from stu_apply_information where stu_level1manager = 1")
    public List<StudApplyInformation> manager2GetInformation();

    @Select("select * from stu_apply_information where stu_level2manager = 1")
    public List<StudApplyInformation> manager3GetInformation();

    //所有通过的
    @Select("select * from stu_apply_information where stu_level3manager = 1")
    public List<StudApplyInformation> studentGetInformation();

    //用户自己的
    @Select("select * from stu_apply_information where user_id = #{userId}")
    public StudApplyInformation getMyApplyInformation(String userId);

    @Select("select * from stu_apply_information where stu_selfcheck = 1")
    public List<StudApplyInformation> finalOutcome();


    public StudApplyInformation selectStudApplyInformationById(String userId);
}
