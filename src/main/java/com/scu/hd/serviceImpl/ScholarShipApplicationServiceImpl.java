package com.scu.hd.serviceImpl;

import com.scu.hd.dao.ScholarShipApplicationDAO;
import com.scu.hd.entity.ScholarApplicationInformation;
import com.scu.hd.entity.ScholarShipApplication;
import com.scu.hd.service.ScholarShipApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author hyy
 * @date 2019/6/27 12:24
 */

@Service
public class ScholarShipApplicationServiceImpl implements ScholarShipApplicationService {

    @Autowired
    ScholarShipApplicationDAO scholarShipApplicationDAO;

    //学生申请奖助学金
    @Override
    public int insertScholarShipApplication(ScholarShipApplication scholarShipApplication) {
        return scholarShipApplicationDAO.insertScholarShipApplication(scholarShipApplication);
    }

    //根据学号查询申请记录
    @Override
    public List<ScholarApplicationInformation> getApplyScholarInformationByStuId(int stu_id) {
        return scholarShipApplicationDAO.getApplyScholarInformationByStuId(stu_id);
    }

    //获得所有奖学金申请记录
    @Override
    public List<ScholarShipApplication> getApplyScholarInformation() {
        return scholarShipApplicationDAO.getApplyScholarInformation();
    }


    //管理员确认奖学金申请是否通过
    @Override
    public int affirmOrDeny(ScholarShipApplication scholarShipApplication) {
        return scholarShipApplicationDAO.affirmOrDeny(scholarShipApplication);
    }
}
