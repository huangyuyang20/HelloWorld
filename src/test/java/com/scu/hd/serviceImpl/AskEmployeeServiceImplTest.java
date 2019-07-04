package com.scu.hd.serviceImpl;

import com.scu.hd.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zhong songzhi
 * @create 2019-06-28-16:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AskEmployeeServiceImplTest {
    @Autowired
    AskEmployeeServiceImpl askEmployeeService;
    @Test
    public void qureyById() {
        Employee a = askEmployeeService.QureyById("123");
        System.out.println(a);
       // Assert.assertEquals("吕建成",a.getEmName());
    }

}