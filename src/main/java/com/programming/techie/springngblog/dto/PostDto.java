package com.programming.techie.springngblog.dto;

public class PostDto {
    private Long id;
    private String content;
    private String title;
    private String username;
    private String short_description;
    private String category;
    private String picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCategory(String category)  {
        this.category = category;
    }

    public void setPicture(String picture)  {
        this.picture = picture;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getCategory() {
        return category;
    }

    public String getPicture() {
        return picture;
    }

    public String getShort_description() {
        return short_description;
    }
}
