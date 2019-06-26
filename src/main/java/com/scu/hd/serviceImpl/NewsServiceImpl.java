package com.scu.hd.serviceImpl;

import com.scu.hd.dao.NewsDAO;
import com.scu.hd.entity.News;
import com.scu.hd.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 18:32
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsDAO newsDAO;


    @Override
    public News QueryByTitleNum(int titleNum) {
        return newsDAO.QueryByTitleNum(titleNum);
    }

    @Override
    public List<News> getNews() {
        return newsDAO.getNews();
    }

    @Override
    public List<News> QueryByTime(String time) {
        return newsDAO.QueryByTime(time);
    }


}
