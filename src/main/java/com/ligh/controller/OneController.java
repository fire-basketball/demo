package com.ligh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("one")
public class OneController {



    @RequestMapping("index")
    public String index(ModelMap map){
        map.addAttribute("password","123456");
        return "interceptor1";
    }

}
