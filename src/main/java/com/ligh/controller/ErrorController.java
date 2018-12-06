package com.ligh.controller;

import com.ligh.util.InfoCode;
import com.ligh.util.RespInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("error")
    public String error(){

        int a = 1/0;
        return "error";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror(){
        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("getAjaxerror")
    @ResponseBody
    public RespInfo getAjaxerror(){
        RespInfo respInfo = new RespInfo();
        respInfo.setStatus(InfoCode.SUCCESS);
        respInfo.setContent("555");
        int a = 1 /0;

        return respInfo;
    }

}
