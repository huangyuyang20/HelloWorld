package com.scu.hd.dao;

import com.scu.hd.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:48
 */
@Mapper
@Repository
public interface UpdateEmployeeDao {
    @Update("update employee set em_name = #{emName},em_salary=#{emSalary},em_appraise=#{emAppraise}," +
            "em_birthday=#{emBirthday},em_birthplace=#{emBirthPlace},em_phone=#{emPhone}," +
            "em_email=#{emEmail},em_id_card=#{emIdCard},em_image=#{emImage},em_nation=#{emNation}," +
            "em_department=#{emDepartment},em_position=#{emPosition} where em_id = #{emId}")
     void updateEmployee(Employee newemployee);


}
