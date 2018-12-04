package com.ligh.controller;

import com.ligh.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("th")
public class ThymeleafController {


    @RequestMapping("index")
    public String index(ModelMap map){
        map.addAttribute("name","thymeleaf-imooc");
        return "thymeleaf/index";
    }

    @RequestMapping("getData")
    public String getData(ModelMap map){

        User user = new User();
        user.setName("superadmin");
        user.setAge(16);
        user.setDesc("<font color='green'><b>hello</b></font>");
        user.setBirth(new Date());
        map.addAttribute("user",user);
        return "thymeleaf/test";
    }

    @RequestMapping("postform")
    public String postform(User u){
        System.out.println(u.getName());
        System.out.println(u.getAge());
        return "redirect:/thymeleaf/test";
    }

    @RequestMapping("getUsers")
    public String getUsers(ModelMap map){
        List<User> userList = new ArrayList<User>();
        User user1 = new User("李国辉", 25, "<font color='green'><b>你好啊~</b></font>", new Date());
        User user2 = new User("沈猪猪", 23, "<font color='green'><b>很好~</b></font>", new Date());
        User user3 = new User("ligh", 22, "<font color='green'><b>非常好~</b></font>", new Date());
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        map.addAttribute("userList",userList);
        return "thymeleaf/test";
    }

}
