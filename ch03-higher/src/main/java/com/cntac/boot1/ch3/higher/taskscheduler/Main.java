package com.cntac.boot1.ch3.higher.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main
 * @Description:
 * @author: libl
 * @date: 2019/08/19 17:00
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        ScheduledTaskService schedulerTaskService = context.getBean(ScheduledTaskService.class);

    }
}
