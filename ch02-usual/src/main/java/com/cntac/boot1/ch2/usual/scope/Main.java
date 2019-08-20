package com.cntac.boot1.ch2.usual.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main
 * @Description:
 * @author: libl
 * @date: 2019/08/15 16:45
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1=context.getBean(DemoSingletonService.class);
        DemoSingletonService s2=context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1=context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2=context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等："+s1.equals(s2));
        System.out.println("p1与p2是否相等："+p1.equals(p2));
    }
}
