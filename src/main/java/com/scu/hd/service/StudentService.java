package com.scu.hd.service;

import com.scu.hd.entity.Student;

import java.util.List;

/**
 * @author hyy
 * @date 2019/7/3 21:31
 */
public interface StudentService {
    public int insertStudent(Student student);
    public Student selectStudentById(String stuId);
    public int UpdateStudentInformation(Student student);
    public List<Student> getAllStudent();
    public int deleteStudent(Student student);
}
