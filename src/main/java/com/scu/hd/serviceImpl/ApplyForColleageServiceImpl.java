package com.scu.hd.serviceImpl;

import com.scu.hd.dao.ApplyForColleageDao;
import com.scu.hd.dao.LoginMapper;
import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.service.ApplyForColleageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhong songzhi
 * @create 2019-06-29-15:47
 */
@Service
public class ApplyForColleageServiceImpl implements ApplyForColleageService {
    @Autowired
    ApplyForColleageDao applyForColleageDao;

    @Autowired
    LoginMapper loginMapper;

    //确认
    @Override
    public void makesureLevel1(Integer stuLevel1manager, Integer stuApplyId){ applyForColleageDao.makesureLevel1(stuLevel1manager,stuApplyId);}

    @Override
    public void makesureLevel2(Integer stuLevel2manager, Integer stuApplyId){applyForColleageDao.makesureLevel2(stuLevel2manager,stuApplyId);}

    @Override
    public void makesureLevel3(Integer stuLevel3manager, Integer stuApplyId){applyForColleageDao.makesureLevel3(stuLevel3manager,stuApplyId);}

    @Override
    public void makesureSelfCheck(Integer stuSlefcheck, Integer stuApplyId){applyForColleageDao.makesureSelfCheck(stuSlefcheck,stuApplyId);}

    //获取信息
    @Override
    public List<StudApplyInformation> manager1GetInformation(){return loginMapper.manager1GetInformation();}

    @Override
    public List<StudApplyInformation> manager2GetInformation(){return loginMapper.manager2GetInformation();}

    @Override
    public List<StudApplyInformation> manager3GetInformation(){return loginMapper.manager3GetInformation();}

    @Override
    public List<StudApplyInformation> studentGetInformation(){return loginMapper.studentGetInformation();}

    @Override
    public List<StudApplyInformation> finalOutcome(){return loginMapper.finalOutcome();}

    @Override
    public  StudApplyInformation getMyApplyInformation(String userId){ return  loginMapper.getMyApplyInformation(userId);}
}

