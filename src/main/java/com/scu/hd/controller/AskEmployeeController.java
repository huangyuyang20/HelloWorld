package com.scu.hd.controller;

import com.scu.hd.entity.Employee;
import com.scu.hd.service.AskEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:41
 */
@RestController
@RequestMapping("/askEmployee")
public class AskEmployeeController {
    @Autowired
    AskEmployeeService askEmployeeService;

    @RequestMapping("getInformation")
    public Employee getInformation(String employeeId){
        return askEmployeeService.QureyById(employeeId);
    }

}
