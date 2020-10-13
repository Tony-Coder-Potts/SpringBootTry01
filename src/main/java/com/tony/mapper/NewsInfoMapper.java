package com.tony.mapper;

import com.tony.dao.NewsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
@Mapper
public interface NewsInfoMapper {
    NewsInfo getNewsById(String id);
    void createAPieceOfNews(NewsInfo newsInfo);
}