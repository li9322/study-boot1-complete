package com.cntac.boot1.ch2.usual.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main
 * @Description:
 * @author: libl
 * @date: 2019/08/19 13:50
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService=context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
