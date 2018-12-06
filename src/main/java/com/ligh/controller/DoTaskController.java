package com.ligh.controller;

import com.ligh.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
@RequestMapping("tasks")
public class DoTaskController {

    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("test1")
    public String test1() throws Exception {
        long start = System.currentTimeMillis();
        Future<Boolean> a = asyncTask.doTask1();
        Future<Boolean> b = asyncTask.doTask2();
        Future<Boolean> c = asyncTask.doTask3();
        while (!a.isDone() || !b.isDone() || !c.isDone()){
            if(a.isDone() && b.isDone() && c.isDone()){
                break;
            }
        }
        long end = System.currentTimeMillis();
        String times = "任务全部完成,总耗时: "+ (end-start) + "毫秒";
        System.out.println(times);
        return times;
    }
}
