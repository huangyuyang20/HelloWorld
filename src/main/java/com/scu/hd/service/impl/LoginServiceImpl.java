package com.scu.hd.service.impl;

import com.scu.hd.dao.LoginMapper;
import com.scu.hd.entity.User;
import com.scu.hd.entity.UserStudApplyInformationOV;
import com.scu.hd.service.LoginService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    Logger log;

    @Autowired
    LoginMapper loginMapper;


    @Override
    public void insertUserStudentOV(UserStudApplyInformationOV user) {
        log.info(String.format("插入数据: %s %s", user.getUser(), user.getStudApplyInformation()));
        loginMapper.insertUser(user.getUser());
        loginMapper.insertStudApplyInformation(user.getStudApplyInformation());
    }

    @Override
    public User selectUserById(String userId) {

        return loginMapper.selectUserById(userId);
    }
}