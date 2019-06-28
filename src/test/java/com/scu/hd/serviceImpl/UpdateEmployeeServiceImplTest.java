package com.scu.hd.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zhong songzhi
 * @create 2019-06-28-17:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateEmployeeServiceImplTest {

    @Autowired
    private UpdateEmployeeServiceImpl updateEmployeeService;

    @Test
    public void updateEmployee() {
        updateEmployeeService.updateSalary(100,"001");
    }

    @Test
    public void updateSalary() {
    }

    @Test
    public void updateAppraise() {
    }
}