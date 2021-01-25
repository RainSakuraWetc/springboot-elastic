package com.wetc.elastic;


import com.wetc.elastic.bean.Article;
import com.wetc.elastic.bean.Book;
import com.wetc.elastic.reposititory.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticApplicationTests {

    @Autowired
    JestClient jestClient;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
        Article article = new Article();
        article.setId(1);
        article.setTitle("好消息");
        article.setAuthor("test");
        article.setContent("test");
        Index build = new Index.Builder(article).index("wetc").type("news").build();
        try {
            jestClient.execute(build);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contextLoad() {
        Book book = new Book();
        book.setAuthor("tes");
        book.setBookName("tesa");
        book.setId(1);
        bookRepository.index(book);
    }



}
