package com.scu.hd.dao;

import com.scu.hd.entity.StudApplyInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhong songzhi
 * @create 2019-06-29-15:24
 */
@Mapper
@Repository
public interface ApplyForColleageDao {
    //各级确认学生信息（通过为1，不通过为-1，未确认为0）
//    @Update("update stu_apply_information set stu_level1manager = #{stuLevel1manager} where stu_apply_id = #{stuApplyId} ")
//    void makesureLevel1(@Param("stuLevel1manager") Integer stuLevel1manager,@Param("stuApplyId") Integer stuApplyId);
//
//    @Update("update stu_apply_information set stu_level2manager = #{stuLevel2manager} where stu_apply_id = #{stuApplyId}")
//    void makesureLevel2(@Param("stuLevel2manager") Integer stuLevel2manager,@Param("stuApplyId") Integer stuApplyId);
//
//    @Update("update stu_apply_information set stu_level3manager = #{stuLevel3manager} where stu_apply_id = #{stuApplyId} ")
//    void makesureLevel3(@Param("stuLevel3manager") Integer stuLevel3manager,@Param("stuApplyId") Integer stuApplyId);
//
//    @Update("update stu_apply_information set stu_selfcheck = #{stuSlefcheck} where stu_apply_id = #{stuApplyId}")
//    void makesureSelfCheck(@Param("stuSlefcheck") Integer stuSlefcheck,@Param("stuApplyId") Integer stuApplyId);

    @Update("update stu_apply_information set stu_level1manager = #{stuLevel1manager} where user_id = #{userId} ")
    void makesureLevel1(@Param("stuLevel1manager") Integer stuLevel1manager,@Param("userId") String userId);

    @Update("update stu_apply_information set stu_level2manager = #{stuLevel2manager} where stu_apply_id = #{userId}")
    void makesureLevel2(@Param("stuLevel2manager") Integer stuLevel2manager,@Param("userId") String userId);

    @Update("update stu_apply_information set stu_level3manager = #{stuLevel3manager} where stu_apply_id = #{userId} ")
    void makesureLevel3(@Param("stuLevel3manager") Integer stuLevel3manager,@Param("userId") String userId);

    @Update("update stu_apply_information set stu_selfcheck = #{stuSlefcheck} where stu_apply_id = #{userId}")
    void makesureSelfCheck(@Param("stuSlefcheck") Integer stuSlefcheck,@Param("userId") String userId);

    //在各级奖上一级确认的学生选出


    List<StudApplyInformation> manager1GetInformation();


    List<StudApplyInformation> manager2GetInformation();


    List<StudApplyInformation> manager3GetInformation();

    //所有通过的
    List<StudApplyInformation> studentGetInformation();

    //用户自己的
    StudApplyInformation getMyApplyInformation(String userId);

    List<StudApplyInformation> finalOutcome();
}
