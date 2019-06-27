package com.scu.hd.controller;


import com.scu.hd.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/27-11:19
 * @module:   [学生申请模块]
 * @describe: []
 * @version:  v1.0
 */
@RestController
@RequestMapping("/student/application")
public class ApplicationController {

    /**
     * 初始申请数据
     * @return
     */
    @GetMapping
    public Student getInitInfo(){
        Student student = new Student();
        return student;
    }

    /**
     * 修改申请
     * @param student
     * @return
     */
    @PostMapping("/edit")
    public Student editInfo(Student student){
        return student;
    }
}
