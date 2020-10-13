package com.tony.controller;
import com.tony.service.NewsInfoService;
import com.tony.pojo.NewsInfo;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

@RestController
public class NewsInfoController {
    private NewsInfoService service = new NewsInfoService();
    @RequestMapping(value = "news/",method = RequestMethod.GET)
    public String getNews() throws SQLException {
        return service.refreshNews();
    }

    @RequestMapping(value = "news/",method = RequestMethod.POST)
    public String addNews() throws SQLException{

        return "OK";
    }
}
