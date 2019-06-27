package com.scu.hd.service;

import com.scu.hd.entity.SchloarShip;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 20:53
 */
public interface SchloarShipService {

    public int InsertSchloarShip(SchloarShip schloarShip);

    public SchloarShip SelectScholarshipById(int scholarship_id);

    public List<SchloarShip> getScholarships();

    public int alterScholarship(SchloarShip schloarShip);

    public int deleteScholarship(int scholarshipId);

    public List<SchloarShip> selectScholarshipBySchoTime(String schoTime);;
}
