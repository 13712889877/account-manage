package com.cg.entity.generate;

import java.util.Date;
import java.util.List;

public class Mood {
    private Integer id;

    private String name;

    private String content;

    private String picture;

    private Date date;

    private List<NewComment> commentList;

    public List<NewComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<NewComment> commentList) {
        this.commentList = commentList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}