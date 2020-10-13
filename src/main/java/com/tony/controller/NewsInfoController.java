package com.tony.controller;
import com.tony.dao.NewsInfo;
import com.tony.mapper.NewsInfoMapper;
import com.tony.service.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

@RestController
public class NewsInfoController {
    @Resource
    private NewsInfoService service = new NewsInfoService();
    @ResponseBody
    @RequestMapping(value = "/news",method = RequestMethod.GET)
    public String getNews(@RequestParam String id)  {
        return service.getNews(id);
    }

    @RequestMapping(value = "news/",method = RequestMethod.POST)
    public String addNews(
            @RequestParam String id,
            @RequestParam String title,
            @RequestParam String type,
            @RequestParam String user_id,
            @RequestParam String link,
            @RequestParam String cover,
            @RequestParam int downloads,
            @RequestParam String create_by,
            @RequestParam String gmt_create,
            @RequestParam String update_by,
            @RequestParam String gmt_update

            ) throws ParseException {

        return service.addNews(id, title, link, type,
                user_id, cover, downloads,
                create_by, gmt_create,update_by,gmt_update);
    }

}
