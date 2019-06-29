package com.scu.hd.service;


import com.scu.hd.dao.LoginMapper;
import com.scu.hd.entity.StudApplyInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuApplicationInformationTest {

    @Autowired
    LoginMapper loginMapper;

    @Test
    public void test(){
        List<StudApplyInformation> informations = loginMapper.
        System.out.println(informations);

    }
}
