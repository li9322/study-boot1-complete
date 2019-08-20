package com.cntac.boot1.ch3.higher.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @ClassName: TaskSchedulerConfig
 * @Description: 配置类
 *  // 通过@EnableScheduling注解开启对计划任务的支持。
 * @author: libl
 * @date: 2019/08/19 17:00
 */
@Configuration
@ComponentScan("com.cntac.boot1.ch3.higher.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
