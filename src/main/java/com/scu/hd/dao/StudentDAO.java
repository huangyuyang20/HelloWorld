package com.scu.hd.dao;

import com.scu.hd.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hyy
 * @date 2019/7/3 21:31
 */
@Repository
@Mapper
public interface StudentDAO {

    @Insert("insert into student(stu_id,stu_name,stu_college,stu_major,stu_birth_date,stu_birth_place,stu_phone,stu_gender,stu_email,stu_account,stu_gpa,stu_status)" +
            "values(#{stuId},#{stuName},#{stuCollege},#{stuMajor},#{stuBirthDate},#{stuBirthPlace},#{stuPhone}," +
            "#{stuGender},#{stuEmail},#{stuAccount},#{stuGpa},#{stuStatus})")
    public int insertStudent(Student student);

    @Select("select * from student where stu_id = #{stuId}")
    public Student selectStudentById(String stuId);

    @Update("update student set stu_phone=#{stuPhone},stu_email=#{stuEmail},employment_information=#{employmentInformation} where stu_id=#{stuId}")
    public int UpdateStudentInformation(Student student);

    @Select("select * from student")
    public List<Student> getAllStudent();

    @Delete("delete from student where stu_id=#{stuId}")
    public int deleteStudent(Student student);

}
