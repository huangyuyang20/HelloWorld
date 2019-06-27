package com.scu.hd.serviceImpl;

import com.scu.hd.dao.AskEmployeeDAO;
import com.scu.hd.entity.Employee;
import com.scu.hd.service.AskEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:28
 */
@Service
public class AskEmployeeServiceImpl implements AskEmployeeService {
    @Autowired
    AskEmployeeDAO askEmployeeDAO;

    @Override
    public Employee QureyById(String employeeId){return askEmployeeDAO.QureyById(employeeId);}

}
