package com.scu.hd.serviceImpl;

import com.scu.hd.dao.AskEmployeeDAO;
import com.scu.hd.entity.Employee;
import com.scu.hd.service.AskEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:28
 */
@Transactional
@Service
public class AskEmployeeServiceImpl implements AskEmployeeService {
    @Autowired
    AskEmployeeDAO askEmployeeDAO;

    @Override
    public Employee QureyById(String employeeId){return askEmployeeDAO.QureyById(employeeId);}

    @Override
    public List<Employee> QueryAll() {
        return askEmployeeDAO.QueryAll();
    }

}
