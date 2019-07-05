package com.scu.hd.service;

import com.scu.hd.entity.StudApplyInformation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhong songzhi
 * @create 2019-06-29-15:44
 */
@Service
public interface ApplyForColleageService {
    //确认信息
    void makesureLevel1(Integer stuLevel1manager, String userId);

    void makesureLevel2(Integer stuLevel2manager, String userId);

    void makesureLevel3(Integer stuLevel3manager, String userId);

    void makesureSelfCheck(Integer stuSlefcheck, String userId);

    //获取信息
    List<StudApplyInformation> manager1GetInformation();

    List<StudApplyInformation> manager2GetInformation();

    List<StudApplyInformation> manager3GetInformation();

    List<StudApplyInformation> studentGetInformation();

    List<StudApplyInformation> finalOutcome();

    //查自己的
    StudApplyInformation getMyApplyInformation(String userId);
}
