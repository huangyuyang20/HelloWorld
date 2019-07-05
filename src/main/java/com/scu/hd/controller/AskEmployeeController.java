package com.scu.hd.controller;

import com.scu.hd.entity.Employee;
import com.scu.hd.service.AskEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:41
 * [员工信息模块]
 * [查询功能]
 */
@RestController
@RequestMapping("/askEmployee")
public class AskEmployeeController {
    @Autowired
    AskEmployeeService askEmployeeService;

    @RequestMapping("getInformation")
    public Employee getInformation(@RequestBody Map<String, Object> map){
        String employeeId = (String) map.get("employeeId");
        return askEmployeeService.QureyById(employeeId);
    }

    @GetMapping("getAll")
    public List<Employee> getAll(){
        System.out.println("======");
        return askEmployeeService.QueryAll();
    }

    @RequestMapping("getSalaryInformation")
    public Integer getSalaryInformation(String employeeId){return  askEmployeeService.QureyById(employeeId).getEmSalary();}

    @RequestMapping("getAppraise")
    public String getAppraise(String employeeId){return askEmployeeService.QureyById(employeeId).getEmAppraise();}
}
