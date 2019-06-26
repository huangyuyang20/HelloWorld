package com.scu.hd.Entity;

import java.util.Date;

/**
 * @author hyy
 * @date 2019/6/26 17:45
 */
public class News {
    private String title;
    private String author;
    private String txt;
    private Date time;
    private int titlenum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getTitlenum() {
        return titlenum;
    }

    public void setTitlenum(int titlenum) {
        this.titlenum = titlenum;
    }

    public News(String title, String author, String txt, Date time, int titlenum) {
        this.title = title;
        this.author = author;
        this.txt = txt;
        this.time = time;
        this.titlenum = titlenum;
    }

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", txt='" + txt + '\'' +
                ", time=" + time +
                ", titlenum=" + titlenum +
                '}';
    }
}

