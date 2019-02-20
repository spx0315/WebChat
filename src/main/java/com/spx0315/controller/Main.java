package com.spx0315.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Main {

    @RequestMapping(value="login ")
    public ModelAndView login(String userName, String password){
        CheckParam checkParam = new CheckParam();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/html/basic/loginSucess");
        mav.addObject("userName",userName);
        mav.addObject("password",password);
        mav.addObject("loginResult",checkParam.checkLoginParam(userName,password).getErrorMsg());
        return mav;
    }
}
