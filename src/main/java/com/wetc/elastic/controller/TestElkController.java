package com.wetc.elastic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wentao.xie
 * @version 1.0
 * @date 2021/1/25 15:43
 * @Desc
 */
@RestController
@RequestMapping
@Slf4j
public class TestElkController {


    @RequestMapping("/test1")
    public String test(){

        log.info("你好啊e");
        log.warn("This is a warn message!");
        log.error("This is error message!");
        return "server被调用了！:";
    }
}
