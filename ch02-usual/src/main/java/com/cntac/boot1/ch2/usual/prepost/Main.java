package com.cntac.boot1.ch2.usual.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main
 * @Description:
 * @author: libl
 * @date: 2019/08/15 16:45
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService=context.getBean(BeanWayService.class);
        Jsr250WayService jsr250WayService=context.getBean(Jsr250WayService.class);
        context.close();
    }
}
