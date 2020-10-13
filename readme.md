# 使用说明

这是一个SpringBoot和Mybatis结合使用的简易demo

写的非常之烂 代码东拼西凑

但是总归是跑起来了qwq

```sql
DROP TABLE IF EXISTS `sci_news`;
CREATE TABLE `sci_news` (
    `id` varchar(32) NOT NULL  COMMENT '新闻ID', 
    `title` varchar(255) NOT NULL  COMMENT '新闻标题',
    `type` varchar(24) NOT NULL  COMMENT '新闻类型', 
    `user_id` varchar(32) NOT NULL  COMMENT '作者ID',
    `link` varchar(255) COMMENT '新闻链接',
    `cover` varchar(255) NOT NULL  COMMENT '新闻封面链接',
    `downloads` Integer(0) NOT NULL  COMMENT '下载量',
    `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',
    `create_by` varchar(24) NOT NULL  COMMENT '创建操作人',
    `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
    `update_by` varchar(24) NOT NULL  COMMENT '更新操作人',
    PRIMARY KEY (`id`), 
    UNIQUE KEY `news_title_index` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

上面是建表语句，配置写的是自己的本地服务器配置

主要两个接口

一个是news，支持post和get两种方法访问

当使用get方法时，带上id作为参数，url示例：127.0.0.1:8080/news/?id=1（建表的时候随手写的数据，没带最后俩参数）

```json
NewsInfo{title='test', link='baidu.com', type='test_type', user_id='001', cover='baidu.png', downloads=10, create_by='Tony', gmt_create=Wed Jan 01 00:00:00 GMT+08:00 2020, update_by='null', gmt_update=null}
```

当使用post方法时，form-data里面写这么些字段：（从postman粘过来的，没啥格式）

```
id:1
title:test
link:WWW.baidu.com
type:test_type
user_id:001
cover:baidu.png
downloads:1
create_by:Tony
gmt_create:2018-09-06 10:16:34
update_by:Tony
gmt_update:2019-09-06 10:16:39
```

然后会直接返回丢过来的内容

（插入以后理论上我可以做一遍同id查找 但是偷个懒）

如果出问题会报武汉大学教务系统错误（默认不开debug真的是emmm 开发火葬场 但是部署就不会出现忘记关掉的事情了2333）

目前来说大致理清楚了mybatis的逻辑，代码组织程度觉得比上次展示直接在controller里面暴力sql查询的好

（当然现在的返回还是直接生成的toString重写，依旧是有点懒人qwq）

目前的写法是，从Application开始运行，Controller会生成一个Service对象用来处理所有的转发请求，在Service内部生成Dao的对象并与mapper做交互，mapper只作为一个接口，具体实现通过编写xml完成

（看了很多篇博客就东拼西凑然后用一种四不像又奇怪的方式完成组织代码）

希望不会被喷的太狠（逃）