package com.example.samsung.a5_30zuoye2.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by samsung on 2019/5/30.
 */
@Entity
public class ShuJu {
    @Id(autoincrement = true)
    private Long id;
    private String img;
    private String content;
    @Generated(hash = 659238703)
    public ShuJu(Long id, String img, String content) {
        this.id = id;
        this.img = img;
        this.content = content;
    }
    @Generated(hash = 1690551306)
    public ShuJu() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
