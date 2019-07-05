package com.scu.hd.controller;


import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.entity.Student;
import com.scu.hd.service.ApplyForColleageService;
import com.scu.hd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zhong songzhi
 * @create 2019-06-29-16:39
 */
@RestController
@RequestMapping("applyForColleage")
public class ApplyForColleageController {
    @Autowired
    ApplyForColleageService applyForColleageService;

    @Autowired
    StudentService studentService;

    //管理员1
    @RequestMapping("manager1GetInformation")
    public List<StudApplyInformation> manager1GetInformation(){ return applyForColleageService.manager1GetInformation(); }

    //如果通过stuLevelmanager为1 否则为0
    @RequestMapping("manager1Makesure")
    public void manager1Makesure(@RequestBody Map<String, Object> map){

        System.out.println(map);
        applyForColleageService.makesureLevel1((Integer)map.get("stuLevel1manager"), (String)map.get("userId"));
    }

    //管理员2
    @RequestMapping("manager2GetInformation")
    public  List<StudApplyInformation> manager2GetInformation(){ return  applyForColleageService.manager2GetInformation();}

    //如果通过stuLevel2manager为1，否则为0
    @RequestMapping("manager2Makesure")
    public  void manager2Makesure(@RequestBody Map<String, Object> map){ applyForColleageService.makesureLevel2((Integer)map.get("stuLevel2manager"), (String)map.get("userId"));}

    //管理员3
    @RequestMapping("manager3GetInformation")
    public  List<StudApplyInformation> manager3GetInformation(){ return  applyForColleageService.manager3GetInformation();}

    //如果通过stuLevel3manager为1，否则为0
    @RequestMapping("manager3Makesure")
    public  void manager3Makesure(@RequestBody Map<String, Object> map){ applyForColleageService.makesureLevel3((Integer)map.get("stuLevel3manager"), (String)map.get("userId"));}


    //所有需要自己确认的学生
    @RequestMapping("studentListForCheck")
    public List<StudApplyInformation> studentGetInformation(){return applyForColleageService.studentGetInformation();}

    //学生查询自己的信息  1:1号未查看, 2:2号未查看, 3:3号未查看, 4:学生未确认, 5:学生确认, -1:未通过, -2:学生拒绝
    @RequestMapping("getSelfState")
    public  int getMyApplyInformation(String userId){

        StudApplyInformation mystudApplyInformation=applyForColleageService.getMyApplyInformation(userId);
        int a1 = mystudApplyInformation.getStuLevel1manager(),a2 = mystudApplyInformation.getStuLevel2manager();
        int a3 = mystudApplyInformation.getStuLevel3manager(),a4 = mystudApplyInformation.getStuSelfcheck();

        if(a1==-1||a2==-1||a3==-1)  return -1; //未通过
        if(a4 == -1) return -2; //学生确认不确认
        int state = (a1<<3)+(a2<<2)+(a3<<1)+a4;
        int[] arrs = new int[16];
        arrs[0] = 1;arrs[8]= 2;arrs[12] = 3 ;arrs[14]= 4;arrs[15]= 5;
        return arrs[state];
    }

    //学生最后确定
    @RequestMapping("studnetMakesure")
    public  void studentMakesure(@RequestBody Map<String, Object> map){
        System.out.println(map);
        applyForColleageService.makesureSelfCheck((Integer) map.get("stuSelfcheck"), (String) map.get("userId"));
        Student student = new Student();
        StudApplyInformation s = applyForColleageService.getMyApplyInformation((String)map.get("userId"));
        System.out.println("申请信息："+s.toString());
        student.setStuBirthDate(s.getStuBirthday());
        student.setStuEmail(s.getStuEmail());
        student.setStuBirthPlace(s.getStuBirthplace());
        student.setStuMajor(s.getStuMajor());
        student.setStuName(s.getStuName());
        student.setStuGpa((double)s.getStuGrade());
        student.setStuGender(s.getStuGender());
        student.setStuPhone(s.getStuPhone());
        student.setStuStatus("在校");
        student.setStuAccount(0);
        student.setStuId(s.getUserId());
        student.setStuGender(s.getStuGender());

        System.out.println("操作结果："+studentService.insertStudent(student));

    }

    //学生录取名单
    @RequestMapping("studentGetInformation")
    public List<StudApplyInformation> finalOutcome() {return  applyForColleageService.finalOutcome();}
}
