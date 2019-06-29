package com.scu.hd.service;


import com.scu.hd.entity.StudApplyInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuApplicationInformationTest {

    @Autowired
    LoginService loginService;

    @Test
    public void test(){
        StudApplyInformation information = loginService.selectStudApplyInformationById("wbx123450");
        System.out.println(information);
    }
}
