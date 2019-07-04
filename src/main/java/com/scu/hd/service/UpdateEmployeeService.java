package com.scu.hd.service;

import com.scu.hd.entity.Employee;
import com.scu.hd.entity.UserEmployeeOV;
import org.springframework.stereotype.Service;

/**
 * @author zhong songzhi
 * @create 2019-06-27-16:16
 */
@Service
public interface UpdateEmployeeService {

    void updateEmployee(Employee employee);

    void updateSalary(Integer emSalary,String emId);

    void updateAppraise(String emAppraise,String emId);

    void insertEmployee(UserEmployeeOV employeeOV);
}
