package com.wetc.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支持两种技术支持了es进行交互
 * 1.Jest
 *  需要导入jest的工具包：io.searchbox
 * 2.SpringData Elasticsearch--存在版本适配问题
 *  版本说明：https://github.com/spring-projects/spring-data-elasticsearch
 *  如果版本不适配
 *      1) 升级springboot版本
 *      2) 安装对应的es版本
 *
 *
 *  1) Client 节点信息 clusterNodes,clusterName
 *  2) ElasticsearchTemplate操作es
 *  3) 启用了ElasticsearchRepository
 */
@SpringBootApplication
public class SpringbootElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticApplication.class, args);
    }

}
