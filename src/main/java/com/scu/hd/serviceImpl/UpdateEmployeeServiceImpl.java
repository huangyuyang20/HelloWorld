package com.scu.hd.serviceImpl;

import com.scu.hd.dao.UpdateEmployeeDao;
import com.scu.hd.entity.Employee;
import com.scu.hd.service.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhong songzhi
 * @create 2019-06-27-16:17
 */
@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {
    @Autowired
    UpdateEmployeeDao updateEmployeeDao;

    @Override
    public void updateEmployee(Employee newemployee){
        updateEmployeeDao.updateEmployee(newemployee);
    }

    @Override
    public void updateSalary(String salary,String id){
        updateEmployeeDao.updateSalary(salary,id);
    }

    @Override
    public void updateAppraise(String newAppraise,String id){
        updateEmployeeDao.updateAppraise(newAppraise,id);
    }

}
