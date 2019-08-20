package com.cntac.boot1.ch3.higher.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ScheduledTaskService
 * @Description: 计划任务执行类
 * @author: libl
 * @date: 2019/08/19 16:55
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    /**
     * // 通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行。
     */
    @Scheduled(fixedRate = 5000)
    public void reprotCurrentTime(){
        System.out.println("每隔五秒执行一次"+dateFormat.format(new Date()));
    }

    /**
     * // 使用cron属性可按照指定时间执行，本例指的是每天11点28分执行；cron是UNIX和类UNIX(Linux)系统下的定时任务。
     */
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("指定时间"+dateFormat.format(new Date()+"执行"));
    }
}
