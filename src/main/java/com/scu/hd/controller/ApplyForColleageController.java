package com.scu.hd.controller;

import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.service.ApplyForColleageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhong songzhi
 * @create 2019-06-29-16:39
 */
@RestController
@RequestMapping("applyForColleage")
public class ApplyForColleageController {
    @Autowired
    ApplyForColleageService applyForColleageService;

    //管理员1
    @RequestMapping("manager1GetInformation")
    public List<StudApplyInformation> manager1GetInformation(){ return applyForColleageService.manager1GetInformation(); }

    //如果通过stuLevelmanager为1 否则为0
    @RequestMapping("manager1Makesure")
    public void manager1Makesure(Integer stuLevel1manager,Integer stuApplyId){ applyForColleageService.makesureLevel1(stuLevel1manager,stuApplyId); }

    //管理员2
    @RequestMapping("manager2GetInformation")
    public  List<StudApplyInformation> manager2GetInformation(){ return  applyForColleageService.manager2GetInformation();}

    //如果通过stuLevel2manager为1，否则为0
    @RequestMapping("manager2Makesure")
    public  void manager2Makesure(Integer stuLevel2manager,Integer stuApplyId){ applyForColleageService.makesureLevel2(stuLevel2manager,stuApplyId);}

    //管理员3
    @RequestMapping("manager3GetInformation")
    public  List<StudApplyInformation> manager3GetInformation(){ return  applyForColleageService.manager3GetInformation();}

    //如果通过stuLevel3manager为1，否则为0
    @RequestMapping("manager3Makesure")
    public  void manager3Makesure(Integer stuLevel3manager,Integer stuApplyId){ applyForColleageService.makesureLevel3(stuLevel3manager,stuApplyId);}


    //所有需要自己确认的学生
    @RequestMapping("studentListForCheck")
    public List<StudApplyInformation> studentGetInformation(){return applyForColleageService.studentGetInformation();}

    //学生查询自己的信息  1:1号未查看, 2:2号未查看, 3:3号未查看, 4:学生未确认, 5:学生确认, -1:未通过, -2:学生拒绝
    @RequestMapping("getSelfState")
    public  int getMyApplyInformation(String userId){

        StudApplyInformation mystudApplyInformation=applyForColleageService.getMyApplyInformation(userId);
        int a1 = mystudApplyInformation.getStuLevel1manager(),a2 = mystudApplyInformation.getStuLevel2manager();
        int a3 = mystudApplyInformation.getStuLevel3manager(),a4 = mystudApplyInformation.getStuSelfcheck();

        if (a1 == 0){
            return 1;
        } else if (a1 == -1){
            return -1;
        } else {
            if (a2 == 0){
                return 2;
            } else if (a2 == -1){
                return -1;
            } else {
                if (a3 == 0){
                    return 3;
                } else if (a3 == -1){
                    return -1;
                } else {
                    if (a4 == 0){
                        return 4;
                    } else if (a4 == 1){
                        return 5;
                    } else {
                        return -2;
                    }
                }
            }
        }
    }

    //学生最后确定
    @RequestMapping("studnetMakesure")
    public  void studentMakesure(Integer stuSelfcheck,Integer stuApplyId){ applyForColleageService.makesureSelfCheck(stuSelfcheck, stuApplyId); }

    //学生录取名单
    @RequestMapping("studentGetInformation")
    public List<StudApplyInformation> finalOutcome() {return  applyForColleageService.finalOutcome();}
}
