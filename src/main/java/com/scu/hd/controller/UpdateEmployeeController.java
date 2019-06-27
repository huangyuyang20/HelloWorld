package com.scu.hd.controller;

import com.scu.hd.entity.Employee;
import com.scu.hd.service.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhong songzhi
 * @create 2019-06-27-16:22
 */
@RestController
@RequestMapping("updateEmployee")
public class UpdateEmployeeController {
    @Autowired
    UpdateEmployeeService updateEmployeeService;

    @RequestMapping("updateAll")
    void updateAll(Employee newemployee){updateEmployeeService.updateEmployee(newemployee);}

    @RequestMapping("updateSalary")
    void updateSalary(String salary,String id){ updateEmployeeService.updateSalary(salary,id);}

    @RequestMapping("updateAppraise")
    void updateAppraise(String newAppraise,String id){ updateEmployeeService.updateAppraise(newAppraise, id);

    }
}
