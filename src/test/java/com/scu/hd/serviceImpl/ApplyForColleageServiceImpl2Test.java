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

        System.out.println(myInformation.size());
        for (StudApplyInformation studApplyInformation : myInformation){
            System.out.println(studApplyInformation);
        }

        List<Object> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(null);
        System.out.println(list.size());

        try {
            Iterator<StudApplyInformation> it = myInformation.iterator();
            if (it.hasNext()){
                StudApplyInformation next = it.next();
                System.out.println(next);
                Assert.assertEquals(next.getStuApplyId(),1);
            }


        } catch (NullPointerException e){
            System.out.println("==============");
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