package com.java1234.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2021-03-22 16:54
 */
@RestController
@RequestMapping("/nacos")
@RefreshScope
public class NacosConfigController {

    @Value("${java1234.name}")
    private String name;

    @Value("${java1234.age}")
    private String age;

    @Value("${java1234.mysql.common}")
    private String mysql;

    @Value("${java1234.redis.common}")
    private String redis;

    @Value("${java1234.crm.config}")
    private String crm;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return mysql + ":" + redis + ":" + crm;
    }
}
