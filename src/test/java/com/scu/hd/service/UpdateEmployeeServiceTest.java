package com.scu.hd.service;

import com.scu.hd.entity.Employee;
import javafx.scene.chart.PieChart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = null;
        //String str = "1997-08-14";
        try{myDate = format.parse("1997-08-13");} catch (ParseException e){e.printStackTrace();}
        Employee employee = new Employee("zsz","001",10000,"god",myDate,"111","1","1","1","1","1","1","1");
        updateEmployeeService.updateEmployee(employee);
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