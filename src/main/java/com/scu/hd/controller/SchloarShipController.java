package com.scu.hd.controller;

import com.scu.hd.entity.SchloarShip;
import com.scu.hd.serviceImpl.SchloarShipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    //添加奖学金
    @RequestMapping("/addScholar")
    public String addSchloar(SchloarShip schloarShip){

        int result = schloarShipService.InsertSchloarShip(schloarShip);

        if (result>0)
            return "添加成功！";
        else return "添加失败！请重试";
    }

    //查询所有奖学金信息
    @RequestMapping("/findScholar")
    public List<SchloarShip> findScholar(){
        return schloarShipService.getScholarships();
    }

    //修改奖学金信息
    @RequestMapping("/alertScholar")
    public String alertScholar(SchloarShip schloarShip){
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
}
