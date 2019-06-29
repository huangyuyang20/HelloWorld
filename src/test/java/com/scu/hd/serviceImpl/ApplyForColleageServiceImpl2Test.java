package com.scu.hd.serviceImpl;

import com.scu.hd.entity.StudApplyInformation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zhong songzhi
 * @create 2019-06-29-16:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplyForColleageServiceImpl2Test {

    @Autowired
    ApplyForColleageServiceImpl applyForColleageService;

    @Test
    public void manager1GetInformation(){
        List<StudApplyInformation> myInformation = applyForColleageService.manager1GetInformation();

        for(StudApplyInformation myApplyInformation : myInformation){
            System.out.println(myApplyInformation);
        }




    }

    @Test
    public void manager2GetInformation() {
    }

    @Test
    public void manager3GetInformation() {
    }

    @Test
    public void studentGetInformation() {
    }

    @Test
    public void finalOutcome() {
    }
}