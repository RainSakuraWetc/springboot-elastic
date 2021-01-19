package com.wetc.elastic.bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author wentao.xie
 * @version 1.0
 * @date 2021/1/13 17:13
 * @Desc
 */
@Document(indexName = "wetc", type = "book")
public class Book {

    private Integer id;
    private String author;
    private String bookName;

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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
