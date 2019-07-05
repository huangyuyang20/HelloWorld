package com.scu.hd.serviceImpl;

import com.scu.hd.dao.StudentDAO;
import com.scu.hd.entity.Student;
import com.scu.hd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hyy
 * @date 2019/7/3 21:38
 */
@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;

    @Override
    public int insertStudent(Student student) {
        return studentDAO.insertStudent(student);
    }

    @Override
    public Student selectStudentById(String stuId) {
        return studentDAO.selectStudentById(stuId);
    }
}
