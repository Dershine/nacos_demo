package com.java1234.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-stock")
public interface StockFeignService {

    @RequestMapping("/stock/test")
    public String test(@RequestParam("info") String info);

}
