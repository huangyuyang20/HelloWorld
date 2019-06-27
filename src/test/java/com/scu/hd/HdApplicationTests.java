package com.scu.hd;

import com.scu.hd.entity.SchloarShip;
import com.scu.hd.entity.ScholarApplicationInformation;
import com.scu.hd.service.SchloarShipService;
import com.scu.hd.service.ScholarShipApplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HdApplicationTests {

    @Autowired
    SchloarShipService schloarShipService;
    @Autowired
    ScholarShipApplicationService scholarShipApplicationService;

    @Test
    public void contextLoads() {

        Date dt = null;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Date date = new Date();
        java.sql.Date transDate = new java.sql.Date(date.getTime());
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        schloarShipService.InsertSchloarShip(new SchloarShip("宝钢奖学金", "2019-2020", 5000, 50, new Date(), new Date()));
    }

    @Test
    public void t1() {
        SchloarShip schloarShip = schloarShipService.SelectScholarshipById(1);
        System.out.println(schloarShip.toString());
    }

    @Test
    public void t2() {
        List<SchloarShip> list = schloarShipService.getScholarships();
        for (SchloarShip schloarShip : list) {
            System.out.println(schloarShip.toString());
        }
    }

    @Test
    public void t3() {
        int result = scholarShipApplicationService.insertScholarShipApplication(new ScholarShipApplication(4, 123, "我是好学生", 0, new Date(), null));
        System.out.println(result);
    }

    @Test
    public void t4() {
        List<ScholarShipApplication> list = scholarShipApplicationService.getApplyScholarInformation();
        for (ScholarShipApplication s : list
        ) {
            System.out.println(s.toString());
        }
    }

    @Test
    public void t5() {
        List<ScholarApplicationInformation> list = scholarShipApplicationService.getApplyScholarInformationByStuId(123);
        for (ScholarApplicationInformation s : list
        ) {
            System.out.println(s.toString());

        }

    }
    @Test
    public void t6(){
        int x = scholarShipApplicationService.affirmOrDeny(new ScholarShipApplication(1,123,"我爱学习",0,new Date(),null));
        System.out.println(x);
    }

}
