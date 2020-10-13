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

    @Test
    void contextLoads() throws SQLException { //根据配置的数据库信息获取连接，执行语句
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("use demo;");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM sci_news;");
//打印结果
        while(resultSet.next()){
            System.out.println(resultSet);
        }
    }

}