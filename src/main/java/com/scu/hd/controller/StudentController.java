package com.scu.hd.controller;

import com.scu.hd.entity.Student;
import com.scu.hd.service.StudentService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hyy
 * @date 2019/7/8 18:08
 */
@RestController
@RequestMapping("/studentManage")
public class StudentController {

    @Autowired
    StudentService studentService;

    //通过id查询
    @RequestMapping("/queryStudentById")
    public Student queryStudentById(@RequestBody Student student){
        return studentService.selectStudentById(student.getStuId());
    }

    //更新学生信息
    @RequestMapping("/updateStudentInformation")
    public String updateStudentInformation(@RequestBody Student student){
        int result = studentService.UpdateStudentInformation(student);
        if (result>=1){
            return "success";
        }else {
            return "fail";
        }
    }

    //查询所有学生信息
    @RequestMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    //删除学生
    @RequestMapping("deleteStudentById")
    public String deleteStudnetById(@RequestBody Student s){
        int result = studentService.deleteStudent(s);
        if (result>=1){
            return "删除成功";
        }else return "删除失败";
    }
}
