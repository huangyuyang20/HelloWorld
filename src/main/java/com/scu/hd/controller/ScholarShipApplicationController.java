package com.scu.hd.controller;

import com.scu.hd.entity.ScholarApplicationInformation;
import com.scu.hd.entity.ScholarShipApplication;
import com.scu.hd.service.ScholarShipApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author hyy
 * @date 2019/6/27 13:51
 */
@RestController
@RequestMapping("/ScholarShipApplication")
public class ScholarShipApplicationController {

    @Autowired
    ScholarShipApplicationService scholarShipApplicationService;

    //用于学生查看自己的申请记录以及状态
    @RequestMapping("/findScholarShipApplicationById")
    public List<ScholarApplicationInformation> findScholarShipApplicationById(int stuId){
        return scholarShipApplicationService.getApplyScholarInformationByStuId(stuId);
    }

    //用于学生申请奖助学金
    @RequestMapping("/applyScholar")
    public String applyScholar(int scholarshipId,int stuId,String schoPersonalstmt){

        ScholarShipApplication scholarShipApplication = new ScholarShipApplication();
        scholarShipApplication.setScholarshipId(scholarshipId);
        scholarShipApplication.setSchoPersonalstmt(schoPersonalstmt);
        scholarShipApplication.setStuId(stuId);
        scholarShipApplication.setSchoApprovetime(new Date());
        scholarShipApplication.setSchoApprove(0);//0表示管理员未确认，1表示通过申请，2表示申请被否定
        int result = scholarShipApplicationService.insertScholarShipApplication(scholarShipApplication);
        http://localhost:8080/ScholarShipApplication/applyScholar?scholarshipId=5&stuId= 123&schoPersonalstmt="Java是世界上最好的语言"
        if (result>0){
            return "申请成功，请耐心等待审核结果";
        }else {
            return "申请失败！请稍后重试";
        }
    }

    //用于奖助学金管理员确认是否同意申请并写入数据库
    @RequestMapping("affirmOrDeny")
    public String affirmOrDeny(int scholarshipId,int stuId,int schoApprove ){

        ScholarShipApplication scholarShipApplication = new ScholarShipApplication();
        scholarShipApplication.setSchoSubmittime(new Date());
        scholarShipApplication.setSchoApprove(schoApprove);
        scholarShipApplication.setStuId(stuId);
        scholarShipApplication.setScholarshipId(scholarshipId);

        int result = scholarShipApplicationService.affirmOrDeny(scholarShipApplication);
        if (result>0){
            return "成功确认";
        }else return "发生错误，请重试！";
    }

}
