package com.ligh.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class TwoController {

    @RequestMapping("index")
    public String index(ModelMap map){
        map.addAttribute("name","李国辉");
        return "interceptor";
    }
}
