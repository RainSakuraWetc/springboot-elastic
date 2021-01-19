package com.wetc.elastic.reposititory;

import com.wetc.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author wentao.xie
 * @version 1.0
 * @date 2021/1/13 17:13
 * @Desc
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {


}
