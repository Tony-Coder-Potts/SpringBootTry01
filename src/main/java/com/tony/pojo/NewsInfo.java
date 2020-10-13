package com.tony.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// 新闻类
// 使用Lombok解决代码冗余问题
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsInfo {
    public String getId() {
        return id;
    }

    public NewsInfo(String id, String title, String type,
                    String user_id, String link, String cover,
                    Integer downloads, Date gmt_create, String create_by,
                    Date gmt_update,String update_by ) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.user_id = user_id;
        this.link = link;
        this.cover = cover;
        this.downloads = downloads;
        this.gmt_create = gmt_create;
        this.gmt_update = gmt_update;
        this.update_by = update_by;
        this.create_by = create_by;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", user_id='" + user_id + '\'' +
                ", link='" + link + '\'' +
                ", cover='" + cover + '\'' +
                ", downloads=" + downloads +
                ", gmt_create=" + gmt_create +
                ", gmt_update=" + gmt_update +
                ", update_by='" + update_by + '\'' +
                ", create_by='" + create_by + '\'' +
                '}';
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_update() {
        return gmt_update;
    }

    public void setGmt_update(Date gmt_update) {
        this.gmt_update = gmt_update;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    private String id;
    private String title;
    private String type;
    private String user_id;
    private String link;
    private String cover;
    private Integer downloads;
    private Date gmt_create;
    private Date gmt_update;
    private String update_by;
    private String create_by;

}
