package com.spx0315.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Basic {

    @Controller
    @RequestMapping(value = "")
    public class BasicController {
        @RequestMapping(value="homepage")
        public String toHomepage(){
            return "/homepage";
        }
    }
}
