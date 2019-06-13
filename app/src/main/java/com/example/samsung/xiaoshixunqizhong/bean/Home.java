package com.example.samsung.xiaoshixunqizhong.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by samsung on 2019/6/13.
 */
@Entity
public class Home {
    @Id(autoincrement = true)
    private Long id;
    private String title;
    private String content;
    private String html;
    private String img;
    @Generated(hash = 239209473)
    public Home(Long id, String title, String content, String html, String img) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.html = html;
        this.img = img;
    }
    @Generated(hash = 858147737)
    public Home() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getHtml() {
        return this.html;
    }
    public void setHtml(String html) {
        this.html = html;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
}
