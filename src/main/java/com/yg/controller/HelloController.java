package com.yg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/mv")
    public ModelAndView test1(){
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }




    @RequestMapping("/test")
    public String test(Map<String,Object> map){
        map.put("test","这是controller的值");
        return "test";
    }
}

