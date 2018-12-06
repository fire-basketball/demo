package com.ligh.controller;

import com.alibaba.fastjson.JSON;
import com.ligh.util.InfoCode;
import com.ligh.util.RedisUtil;
import com.ligh.util.RespInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("test")
    public String test(){
       /* redisTemplate.opsForValue().set("hello","hello redis...");
        RespInfo respInfo = new RespInfo();
        respInfo.setMessage(redisTemplate.opsForValue().get("hello"));
        respInfo.setStatus(InfoCode.SUCCESS);
        respInfo.setContent(redisTemplate.opsForValue().get("hello"));*/
       redisUtil.set("ligh","是一个好人");
        RespInfo respInfo = new RespInfo();
        respInfo.setStatus(InfoCode.SUCCESS);
        respInfo.setMessage(redisUtil.get("ligh"));
        return JSON.toJSONString(respInfo);
    }
}
