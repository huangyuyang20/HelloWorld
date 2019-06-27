package com.scu.hd.dao;

import com.scu.hd.entity.ScholarApplicationInformation;
import com.scu.hd.entity.ScholarShipApplication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author hyy
 * @date 2019/6/27 12:13
 */
@Mapper
@Repository
public interface ScholarShipApplicationDAO {

    //将申请奖学金信息填入数据库中，确认状态默认为0表示未确认
    @Insert("insert into scholarship_application(scholarship_id,stu_id,scho_personalstmt," +
            "scho_approvetime,scho_submittime) " +
            "values(#{scholarshipId},#{stuId},#{schoPersonalstmt}," +
            "#{schoApprovetime},#{schoSubmittime})")
            public int insertScholarShipApplication(ScholarShipApplication scholarShipApplication);

    //查询学生奖学金申请信息
    @Select("select sa.scholarship_id as scholarshipId,sa.stu_id as stuId,sa.scho_approve as schoApprove," +
            "sa.scho_approvetime as schoApprovetime,ss.scho_name as schoName,ss.scho_time as schoTime " +
            "from scholarship_application as sa,scholarship as ss where sa.stu_id = #{stu_id} " +
            "and sa.scholarship_id = ss.scholarship_id")
    public List<ScholarApplicationInformation> getApplyScholarInformationByStuId(int stu_id);

    //所有申请信息
    @Select("select * from scholarship_application")
    public List<ScholarShipApplication> getApplyScholarInformation();

    //确认或者否决
    @Update("update scholarship_application set scho_approve = #{schoApprove},scho_submittime=#{schoSubmittime} " +
            "where scholarship_id = #{scholarshipId} and stu_id = #{stuId}")
    public int affirmOrDeny(ScholarShipApplication scholarShipApplication);
}
