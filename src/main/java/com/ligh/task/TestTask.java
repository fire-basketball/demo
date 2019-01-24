package com.ligh.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //定义没过3秒执行任务
//    @Scheduled(fixedRate = 3000)
//                        秒    分  时 日 月年   每天的6点,17点,的每16秒,36秒,46秒执行一次
    @Scheduled(cron = "16,36,46 0 6,17 * * ? ")
    public void reportCurrentTime(){
        System.out.println("现在时间:" +dateFormat.format(new Date()));
    }

}
