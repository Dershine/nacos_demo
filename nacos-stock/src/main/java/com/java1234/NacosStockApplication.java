package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2021-03-22 16:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosStockApplication.class,args);
    }
}
