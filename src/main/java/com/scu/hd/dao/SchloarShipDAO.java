package com.scu.hd.dao;

import com.scu.hd.entity.SchloarShip;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 20:44
 */
@Mapper
@Repository
public interface SchloarShipDAO {

    //添加奖学金
    @Insert("insert into scholarship(\n" +
            "scho_name,scho_time,scho_money,scho_quota,scho_start_time,scho_deadline)\n" +
           "values(#{schoName},#{schoTime},#{schoMoney},#{schoQuota},#{schoStartTime},#{schoDeadline})")
    public int insertSchloarShip(SchloarShip schloarShip);

    //根据奖学金编号查询
    @Select("select * from scholarship where scholarship_id=#{scholarship_id}")
    public SchloarShip selectScholarshipById(int scholarship_id);

    //获得所有奖学金列表
    @Select("select scholarship_id as scholarshipId, scho_name as schoName,scho_time as schoTime," +
            "scho_money as schoMoney,scho_quota as schoQuota,scho_start_time as schoStartTime,scho_deadline as schoDeadline" +
            " from scholarship")
    public List<SchloarShip> getScholarships();

    //修改奖学金数据，只能够修改金额、人数、截止日期
    @Update("update scholarship set scho_money = #{schoMoney},scho_quota=#{schoQuota}" +
            ",scho_deadline=#{schoDeadline} where scholarship_id=#{scholarshipId}")
    public int alterScholarship(SchloarShip schloarShip);

    //删除奖学金信息
    @Delete("delete from scholarship where scholarship_id=#{scholarshipId}")
    public int deleteScholarship(int scholarshipId);


}
