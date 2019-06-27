package com.scu.hd.controller;

import com.scu.hd.entity.Student;
import com.scu.hd.entity.User;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 学生注册功能
     *  1. 接受user的账号信息, 接受student的部分基本信息
     *  2. 返回success或者fail
     * @param student
     * @return
     */
    @PostMapping("/register")
    public String registerStudent(Student student, User user){
        log.debug(String.format("register %s + %s", student, user));
        return "success";
    }

    /**
     * 登录功能
     *  1. 接受user数据
     *  2. 根据权限管理, 返回到不同的页面
     *
     * @param user
     * @return
     */
    @PostMapping
    public String loginStudent(User user){
        log.debug(String.format("login %s", user));
        return "success";
    }
}
