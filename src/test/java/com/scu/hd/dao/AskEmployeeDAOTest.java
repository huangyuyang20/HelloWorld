package com.scu.hd.dao;

import com.scu.hd.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AskEmployeeDAOTest {
    @Autowired
    AskEmployeeDAO askEmployeeDAO;
    @Test
    public void qureyById() {
        Employee myemployee = askEmployeeDAO.QureyById("123");
        System.out.println(myemployee);
    }
}