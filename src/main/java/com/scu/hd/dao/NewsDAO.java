package com.scu.hd.dao;

import com.scu.hd.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 18:29
 */
@Mapper
@Repository
public interface NewsDAO {

    @Select("select * from news order by time desc")
    public List<News> getNews();

    @Select("select * from news where titlenum = #{titlenum}")
    News QueryByTitleNum(int titlenum);

    @Select("select * from news where time=#{time}")
    List<News> QueryByTime(String time);


}
