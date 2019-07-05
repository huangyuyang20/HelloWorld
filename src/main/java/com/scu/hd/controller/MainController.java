package com.scu.hd.controller;

import com.scu.hd.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping("/index")
    public String home(){
        return "home";
    }


    @GetMapping("/student/application")
    public String application(){
        return "stuAppHome";
    }


   @GetMapping("/student/appstatus")
   public String status(){
        return "stuAppStatus";
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
        return "home";
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

    @GetMapping("/News/newsDetail")
    public String gotoNews(){
        return "newsDetail";
    }

    @RequestMapping("/login-error")
    public String gotoError(){
        return "signin2";
    }

    @GetMapping("/check1")
    public String  check1(){
        return "check1";
    }

    @GetMapping("/check2")
    public String  check2(){
        return "check2";
    }

    @GetMapping("/check3")
    public String  check3(){
        return "check3";
    }

    @GetMapping("/check4")
    public String check4(){
        return "schoAdd";
    }

    @GetMapping("/ScholarManage")
    public String scholarManage(){
        return "schoManage";
    }

    @GetMapping("/ApplyScholar")
    public String ApplyScholar(){

        return "schoApply";
    }

    @GetMapping("/ScholarMakeSure")
    public String ScholarMakeSure(){
        return "schoApplySure";
    }

    @GetMapping("/ApplyScholarStatus")
    public String ApplyScholarStatus(){
        return "schoApplyStatus";
    }

    @GetMapping("/admins/employeeAdd")
    public String schoAdd(){
        return "employeeAdd";
    }

    @GetMapping("/admins/employeeManage")
    public String schoManage(){
        return "employeeManage";
    }

    @GetMapping("/employee")
    public String schoApply(){
        return "employee";
    }

    @GetMapping("/admins/edit")
    public String editEmployee(){
        return "employeeEdit";
    }

//    @GetMapping("/admins")
//    public String admins(){
//        return "adminsMain";
//    }
}
