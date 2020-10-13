package com.tony.service;

import com.tony.dao.NewsInfo;
import com.tony.mapper.NewsInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class NewsInfoService {
    @Autowired
    private NewsInfoMapper newsInfoMapper;


    public String getNews(String id) {

        NewsInfo news = newsInfoMapper.getNewsById(id);

        return news.toString();
    }

    public String addNews(String id, String title, String type, String user_id,
                          String link,String cover, int downloads,
                          String create_by, String gmt_create_tmp,String update_by, String gmt_update_tmp) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date gmt_create = ft.parse(gmt_create_tmp);
        Date gmt_update = ft.parse(gmt_update_tmp);
        NewsInfo newsInfo = new NewsInfo(id, title, link, type,
                user_id, cover, downloads,
                create_by, gmt_create,update_by,gmt_update);

        newsInfoMapper.createAPieceOfNews(newsInfo);
        return newsInfo.toString();

    }

}
