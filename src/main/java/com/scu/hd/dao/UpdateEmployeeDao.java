package com.scu.hd.dao;

import com.scu.hd.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:48
 */
@Mapper
@Repository
public interface UpdateEmployeeDao {
    //更新所有信息
    @Update("update employee set em_salary=#{emSalary},em_appraise=#{emAppraise}," +
            "em_birthday=#{emBirthday},em_birthplace=#{emBirthplace},em_phone=#{emPhone}," +
            "em_email=#{emEmail},em_id_card=#{emIdCard},em_image=#{emImage},em_nation=#{emNation}," +
            "em_department=#{emDepartment},em_position=#{emPosition} where em_id = #{emId}")
     void updateEmployee(Employee employee);
//    //更新工资
//    @Update("update employee set em_salary=#{salary} where em_id = #{id}")
//    void updateSalary(int salary,String id);
    @Update("update employee set em_salary = #{emSalary} where em_id = #{emId}")
    void updateSalary(@Param("emSalary") Integer emSalary,@Param("emId") String emId);
    //更新考评
    @Update("update employee set em_appraise= #{emAppraise} where em_id = #{emId}")
    void updateAppraise(@Param("emAppraise")String emAppraise,@Param("emId")String emId);

    @Insert("insert into employee values (#{emName}, #{emId}, #{emSalary}, #{emAppraise}," +
            "#{emBirthday},#{emBirthplace},#{emPhone}," +
            "#{emEmail},#{emIdCard},#{emImage},#{emNation}," +
            "#{emDepartment},#{emPosition})")
    void insertEmployee(Employee employee);
}
