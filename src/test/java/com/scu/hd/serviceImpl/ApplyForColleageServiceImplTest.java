package com.scu.hd.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zhong songzhi
 * @create 2019-06-29-15:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplyForColleageServiceImplTest {

    @Autowired
    ApplyForColleageServiceImpl applyForColleageService;

    @Test
    public void makesureLevel1() {
        applyForColleageService.makesureLevel1(1,1);
    }

    @Test
    public void makesureLevel2() {
        applyForColleageService.makesureLevel2(1,1);
    }

    @Test
    public void makesureLevel3() {
        applyForColleageService.makesureLevel3(1,1);
    }

    @Test
    public void makesureSelfCheck() {
        applyForColleageService.makesureSelfCheck(1,1);
    }
}