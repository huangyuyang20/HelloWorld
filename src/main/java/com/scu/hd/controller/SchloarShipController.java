package com.scu.hd.controller;

import com.scu.hd.entity.SchloarShip;
import com.scu.hd.entity.Student;
import com.scu.hd.serviceImpl.SchloarShipServiceImpl;
import com.scu.hd.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 21:14
 */
@RestController
@RequestMapping("/scholarShip")
public class SchloarShipController {
    @Autowired
    SchloarShipServiceImpl schloarShipService;
    @Autowired
    StudentServiceImpl studentService;

    //添加奖学金
    @RequestMapping("/addScholar")
    public String addSchloar(@RequestBody SchloarShip schloarShip){

        System.out.println("添加的奖学金："+schloarShip.toString());
        int result = schloarShipService.InsertSchloarShip(schloarShip);

        if (result>0)
            return "success";
        else return "fail";
    }

    //查询所有奖学金信息
    @RequestMapping("/findScholar")
    public List<SchloarShip> findScholar(@RequestBody Student student){
        Student s = studentService.selectStudentById(student.getStuId());
        if (s == null){
            return null;
        }else
        return schloarShipService.getScholarships();
    }

    //查询所有奖学金信息
    @RequestMapping("/findScholarManager")
    public List<SchloarShip> findScholar(){
            return schloarShipService.getScholarships();
    }

    //修改奖学金信息
    @RequestMapping("/alertScholar")
    public String alertScholar(@RequestBody SchloarShip schloarShip){
        System.out.println("奖学金信息："+schloarShip.toString());
        int result = schloarShipService.alterScholarship(schloarShip);
        if (result>0){
            return "修改成功";
        }else {
            return "修改失败，请重试！";
        }
    }

    //删除奖学金
    @RequestMapping("/deleteScholar")
    public String deleteScholar(int scholarshipId){
        int result = schloarShipService.deleteScholarship(scholarshipId);
        if (result>0){
            return "删除成功！";
        }else return "发生了错误，删除失败，请重试！";
    }

    //根据学年来检索奖学金
    @RequestMapping("/findScholarBySchoTime")
    public List<SchloarShip> findScholarBySchoTime(String schoTime){
        return schloarShipService.selectScholarshipBySchoTime(schoTime);

    }

    @RequestMapping("/findScholarById")
    public SchloarShip findScholarById(@RequestBody SchloarShip schloarShip){
        return schloarShipService.SelectScholarshipById(schloarShip.getScholarShipId());
    }
}
