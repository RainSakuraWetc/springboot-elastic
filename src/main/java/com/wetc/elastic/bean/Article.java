package com.wetc.elastic.bean;

import io.searchbox.annotations.JestId;

/**
 * @author wentao.xie
 * @version 1.0
 * @date 2021/1/13 16:31
 * @Desc
 */
public class Article {

    @JestId
    private Integer id;
    private String author;
    private String title;
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}