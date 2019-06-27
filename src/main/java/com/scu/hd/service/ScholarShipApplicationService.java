package com.scu.hd.service;

import com.scu.hd.entity.ScholarApplicationInformation;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/27 12:23
 */
public interface ScholarShipApplicationService {

    public int insertScholarShipApplication(ScholarShipApplication scholarShipApplication);

    public List<ScholarApplicationInformation> getApplyScholarInformationByStuId(int stu_id);

    public List<ScholarShipApplication> getApplyScholarInformation();

    public int affirmOrDeny(ScholarShipApplication scholarShipApplication);
}
