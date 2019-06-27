package com.scu.hd.service;

import com.scu.hd.entity.Employee;
import org.springframework.stereotype.Service;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:26
 */
@Service
public interface AskEmployeeService {

    Employee QureyById(String employeeId);

}
