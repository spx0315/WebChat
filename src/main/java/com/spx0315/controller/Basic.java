package com.spx0315.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Basic {

    @Controller
    @RequestMapping(value = "")//value的内容代表访问的url前缀，什么都不填就代表通过方法上的value来决定，如果这里有值，就需要在加上此前缀，比如如果value是"test"，访问toHomepage方法就要输入url=localhost:8080/test/homeppage，如果这里是空的，就直接访问localhost:8080/homeppage
    public class BasicController {
        @RequestMapping(value="homepage")
        public String toHomepage(){
            return "/homepage";
        }
    }
}
