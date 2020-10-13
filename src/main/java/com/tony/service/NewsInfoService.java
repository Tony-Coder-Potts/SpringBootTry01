package com.tony.service;

import com.tony.pojo.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class NewsInfoService {
    @Autowired
    private DataSource dataSource;
    private String news = "";
    public String refreshNews() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM sci_news;");
        while (resultSet.next()){
            String ID = resultSet.getString(1);
            String title = resultSet.getString(2);
            String type = resultSet.getString(3);
            String user_id = resultSet.getString(4);
            String link = resultSet.getString(5);
            String cover = resultSet.getString(6);
            int downloads = resultSet.getInt(7);
            Date gmt_create = resultSet.getDate(8);
            String create_by = resultSet.getString(9);
            Date gmt_update = resultSet.getDate(10);
            String update_by = resultSet.getString(11);
            NewsInfo aPieceOfnews = new NewsInfo(ID, title,type,user_id,
                    link,cover,downloads,gmt_create,create_by,
                    gmt_update,update_by);
            System.out.println(aPieceOfnews);
            news += aPieceOfnews.toString();
        }
        return news;
    }

}
