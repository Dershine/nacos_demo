package java1234;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/test")
    public String test(String info){
        return "库存2模块接收到的信息:" + info;
    }

}
