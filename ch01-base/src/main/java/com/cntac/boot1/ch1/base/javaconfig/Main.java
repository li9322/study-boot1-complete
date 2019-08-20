package com.cntac.boot1.ch1.base.javaconfig;

import com.fasterxml.jackson.databind.JavaType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main
 * @Description:
 * @author: libl
 * @date: 2019/08/15 14:58
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("java config"));

        context.close();
    }
}
