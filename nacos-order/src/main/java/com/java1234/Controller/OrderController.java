package com.java1234.Controller;

import com.java1234.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/test")
    public String test(@RequestHeader(value = "Truth", required = false) String truth){
        return stockFeignService.test(truth);
    }

}
