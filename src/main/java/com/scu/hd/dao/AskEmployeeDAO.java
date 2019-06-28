package com.scu.hd.dao;

import com.scu.hd.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhong songzhi
 * @create 2019-06-27-15:21
 */
@Mapper
@Repository
public interface AskEmployeeDAO {

    @Select("select * from employee where em_id = #{employeeId}")
    Employee QureyById(String employeeId);


}
