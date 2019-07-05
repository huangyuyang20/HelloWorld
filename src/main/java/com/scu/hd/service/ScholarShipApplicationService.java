package com.scu.hd.service;

import com.scu.hd.entity.ScholarApplicationInformation;
import com.scu.hd.entity.ScholarShipApplication;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/27 12:23
 */
public interface ScholarShipApplicationService {

    public int insertScholarShipApplication(ScholarShipApplication scholarShipApplication);

    public List<ScholarApplicationInformation> getApplyScholarInformationByStuId(String stu_id);

    public List<ScholarApplicationInformation> getApplyScholarInformation();

    public int affirmOrDeny(ScholarShipApplication scholarShipApplication);
}
