package com.scu.hd.serviceImpl;

import com.scu.hd.entity.News;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zhong songzhi
 * @create 2019-06-28-16:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceImplTest {
    @Autowired
    NewsServiceImpl newsService;
    @Test
    public void queryByTitleNum() {
        News mynews = newsService.QueryByTitleNum(106);
        Assert.assertEquals(mynews.getTitlenum(),106);
    }

    @Test
    public void getNews() {
    }

    @Test
    public void queryByTime() {
    }
}