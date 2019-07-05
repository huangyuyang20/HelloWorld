package com.scu.hd.service;

import com.scu.hd.entity.Student;

/**
 * @author hyy
 * @date 2019/7/3 21:31
 */
public interface StudentService {
    public int insertStudent(Student student);
    public Student selectStudentById(String stuId);
}
