package com.example.demo.model;

import javax.persistence.*;

public class News {
    @Id
    private String id;
    @Column(name = "type_id")
    private String typeId;
    /**
     * 新闻列表显示模式（0：纯文字，无图片 1：有一张图片 3：有三张图片
     */
    @Column(name = "img_type")
    private Integer imgType;
    /**
     * 如果img_type为1或者3的话，本字段必填，是一个json数组[''] ['','','']
     */
    @Column(name = "cover_img")
    private String coverImg;
    /**
     * 新闻标题
     */
    private String title;
    /**
     * 发布者
     */
    private String publisher;
    /**
     * 发布者头像
     */
    @Column(name = "publisher_face")
    private String publisherFace;

    /**
     * 发布时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 新闻内容
     */
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisherFace() {
        return publisherFace;
    }

    public void setPublisherFace(String publisherFace) {
        this.publisherFace = publisherFace;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
