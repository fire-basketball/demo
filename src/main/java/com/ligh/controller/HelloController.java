package com.ligh.controller;

import com.ligh.entity.Resource;
import com.ligh.entity.User;
import com.ligh.util.InfoCode;
import com.ligh.util.RespInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("hello")
    @ResponseBody
    public Object hello(){
        User user = new User("李国辉", 26, new Date());
        RespInfo respInfo = new RespInfo();
        respInfo.setMessage("人物信息:");
        respInfo.setStatus(InfoCode.SUCCESS);
        respInfo.setContent(user);
        return respInfo;
    }

    @RequestMapping("reflactProperties")
    @ResponseBody
    public RespInfo reflactProperties(){
        RespInfo respInfo = new RespInfo();
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        respInfo.setContent(bean);
        return respInfo;
    }
}
