package com.scu.hd.controller;

import com.scu.hd.entity.Employee;
import com.scu.hd.entity.UserEmployeeOV;
import com.scu.hd.service.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhong songzhi
 * @create 2019-06-27-16:22
 * [员工信息模块]
 * [更新功能]
 */
@RestController
@RequestMapping("updateEmployee")
public class UpdateEmployeeController {
    @Autowired
    UpdateEmployeeService updateEmployeeService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("updateAll")
    void updateAll(@RequestBody Employee employee){
//        System.out.println(employee);
        updateEmployeeService.updateEmployee(employee);
    }

    @RequestMapping("updateSalary")
    void updateSalary(Integer emSalary,String emId){ updateEmployeeService.updateSalary(emSalary,emId);}

    @RequestMapping("updateAppraise")
    void updateAppraise(String emAppraise,String emId){ updateEmployeeService.updateAppraise(emAppraise, emId);

    }

    @PostMapping("insert")
    public void insertEmployee(@RequestBody UserEmployeeOV employeeOV){
        employeeOV.getUser().setPassword(passwordEncoder.encode(employeeOV.getUser().getPassword()));
        updateEmployeeService.insertEmployee(employeeOV);
    }


}
