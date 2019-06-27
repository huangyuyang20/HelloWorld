package com.scu.hd.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scu.hd.entity.News;
import com.scu.hd.serviceImpl.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 18:33
 */
@RestController
@RequestMapping("/News")
public class NewsController {
    @Autowired
    NewsServiceImpl newsService;

    @RequestMapping("/getNews")
    public PageInfo<News> pagehelpergetnews(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<News> newsPageInfo = new PageInfo<>(newsService.getNews());
        return newsPageInfo;
    }

    @RequestMapping("/getNewsByTitleNum")
    public News getNewsByID(int titleNum){
        return newsService.QueryByTitleNum(titleNum);
    }



    @RequestMapping("/getNewsByTime")
    public List<News> getNewsByTime(String time){
        return newsService.QueryByTime(time);
    }

}
