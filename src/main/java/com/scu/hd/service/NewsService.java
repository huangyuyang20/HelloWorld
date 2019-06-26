package com.scu.hd.service;

import com.scu.hd.entity.News;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hyy
 * @date 2019/6/26 18:31
 */
@Service
public interface NewsService {

    News QueryByTitleNum(int titleNum);

    List<News> getNews();

    List<News> QueryByTime(String time);
}
