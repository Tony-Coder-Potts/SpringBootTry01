package com.tony.dao;

// 新闻类


import java.util.Date;

public class NewsInfo {
    private String id;
    private String title;
    private String link;
    private String type;
    private String user_id;
    private String cover;
    private int downloads;
    private String create_by;
    private Date gmt_create;
    private String update_by;
    private Date gmt_update;

    public NewsInfo() {
    }

    public NewsInfo(String id, String title, String link, String type, String user_id, String cover, int downloads, String create_by, Date gmt_create, String update_by, Date gmt_update) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.type = type;
        this.user_id = user_id;
        this.cover = cover;
        this.downloads = downloads;
        this.create_by = create_by;
        this.gmt_create = gmt_create;
        this.update_by = update_by;
        this.gmt_update = gmt_update;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmt_update() {
        return gmt_update;
    }

    public void setGmt_update(Date gmt_update) {
        this.gmt_update = gmt_update;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", type='" + type + '\'' +
                ", user_id='" + user_id + '\'' +
                ", cover='" + cover + '\'' +
                ", downloads=" + downloads +
                ", create_by='" + create_by + '\'' +
                ", gmt_create=" + gmt_create +
                ", update_by='" + update_by + '\'' +
                ", gmt_update=" + gmt_update +
                '}';
    }
}
