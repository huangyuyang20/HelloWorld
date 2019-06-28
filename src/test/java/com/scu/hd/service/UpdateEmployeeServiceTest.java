package com.scu.hd.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zhong songzhi
 * @create 2019-06-28-16:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateEmployeeServiceTest {
    @Autowired
    private UpdateEmployeeService updateEmployeeService;
    @Test
    public void updateEmployee() {

    }

    @Test
    public void updateSalary() {
        updateEmployeeService.updateSalary(100,"001");
    }

    @Test
    public void updateAppraise() {
        updateEmployeeService.updateAppraise("goodman","001");
    }
}