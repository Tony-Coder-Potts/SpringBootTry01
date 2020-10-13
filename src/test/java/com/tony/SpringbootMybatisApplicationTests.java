package com.tony;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SpringbootMybatisApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//}

import com.tony.dao.NewsInfo;
import com.tony.mapper.NewsInfoMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
//使其运行在spring环境中进行测试.
//@RunWith如果没有，需要添加Junit依赖，具体解决方法在下面。
@RunWith(SpringJUnit4ClassRunner.class)
class SpringBootMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private NewsInfoMapper newsInfoMapper;


//打印结果
    @Test void test(){
        NewsInfo newsInfo = newsInfoMapper.getNewsById("1");
        System.out.println(newsInfo);

    }

}