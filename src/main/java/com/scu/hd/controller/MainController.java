package com.scu.hd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/26-21:29
 * @module:   [路由模块]
 * @describe: []
 * @version:  v1.0
 */
@Controller
@RequestMapping()
public class MainController {

    @GetMapping("/student/application")
    public String application(){
        return "stuAppHome";
    }

    @GetMapping("/admins")
    public String test(){
        return "stuAppHome";
    }

    /**
     * 默认跳转
     */
    @GetMapping("/login")
    public String turn(){
        return "signin";
    }

    /**
     * 跳转登录
     * @return
     */
    @GetMapping
    public String gotoInfo(){
        return "signin";
    }

    /**
     * 跳转注册
     */
    @GetMapping("/register")
    public String gotoRegister(){
        return "stuAppRegister";
    }


    /**
     * 跳转完善信息
     */
    @GetMapping("/application")
    public String gotoApplication(){
        return "stuAppHome";
    }

}
