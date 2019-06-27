package com.scu.hd.controller;

import com.scu.hd.entity.AppResponse;
import com.scu.hd.entity.User;
import com.scu.hd.entity.UserStudApplyInformationOV;
import com.scu.hd.service.LoginService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/26-21:41
 * @module:   [信息注册模块]
 * @describe: [
 *                 1. 学生注册
 *                 2. 学生登录
 * ]
 * @version:  v1.0
 */

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private Logger log;

    @Autowired
    private LoginService loginService;


    /**
     * 学生注册功能
     *  1. 接受user的账号信息, 接受student的部分基本信息
     *  2. 返回success或者fail
     * @param user
     * @return
     */
    @PostMapping("/register")
    public AppResponse registerStudent(@RequestBody UserStudApplyInformationOV user){
        log.info(String.format("register: %s", user));
        AppResponse resp = new AppResponse();
        try {
            loginService.insertUserStudentOV(user);
        } catch (Exception e){
            resp.setCode(2);
            resp.setStatus("fail");
            resp.setInfo("失败原因: ....");
        }
        return resp;
    }

    /**
     * 登录功能
     *  1. 接受user数据
     *  2. 根据权限管理, 返回到不同的页面
     * @param user
     * @return
     */
    @PostMapping
    public AppResponse loginStudent(User user){
        log.debug(String.format("login %s", user));
        AppResponse resp = new AppResponse();
        if (user == null || user.getUserPassword() == null || user.getUserId() == null){
            resp.setCode(2);
            resp.setStatus("fail");
            resp.setInfo("录入非法");
        }else {
            User selectUser = loginService.selectUserById(user.getUserId());
            if (selectUser == null || !user.getUserPassword().equals(selectUser.getUserPassword())) {
                resp.setCode(2);
                resp.setStatus("fail");
                resp.setInfo("密码不符合");
            }
        }
        System.out.println(resp);
        return resp;
    }
}
