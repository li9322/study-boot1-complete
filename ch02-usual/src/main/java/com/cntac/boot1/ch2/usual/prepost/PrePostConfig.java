package com.cntac.boot1.ch2.usual.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: PrePostConfig
 * @Description:
 * @author: libl
 * @date: 2019/08/19 14:47
 */
@Configuration
@ComponentScan("com.cntac.boot1.ch2.usual.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    Jsr250WayService jsr250WayService(){
        return new Jsr250WayService();
    }
}
