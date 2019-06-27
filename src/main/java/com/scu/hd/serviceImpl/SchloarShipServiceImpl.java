package com.scu.hd.serviceImpl;

import com.scu.hd.dao.SchloarShipDAO;
import com.scu.hd.entity.SchloarShip;
import com.scu.hd.service.SchloarShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 20:53
 */
@Service
public class SchloarShipServiceImpl implements SchloarShipService {
    @Autowired
    SchloarShipDAO schloarShipDAO;

    //新添加奖助学金信息
    @Override
    @Transactional
    public int InsertSchloarShip(SchloarShip schloarShip) {
        return schloarShipDAO.insertSchloarShip(schloarShip);
    }

    //根据奖学金标号查询奖学金信息
    @Override
    @Transactional
    public SchloarShip SelectScholarshipById(int scholarship_id) {
        return schloarShipDAO.selectScholarshipById(scholarship_id);
    }

    //查询所有奖学金信息
    @Override
    @Transactional
    public List<SchloarShip> getScholarships() {
        return schloarShipDAO.getScholarships();
    }

    //修改奖学金信息
    @Override
    @Transactional
    public int alterScholarship(SchloarShip schloarShip) {
        return schloarShipDAO.alterScholarship(schloarShip);
    }

    //删除奖学金
    @Override
    @Transactional
    public int deleteScholarship(int scholarshipId) {
        return schloarShipDAO.deleteScholarship(scholarshipId);
    }
}
