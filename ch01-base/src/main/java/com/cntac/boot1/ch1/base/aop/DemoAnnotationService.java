package com.cntac.boot1.ch1.base.aop;

import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoAnnotationService
 * @Description:
 * @author: libl
 * @date: 2019/08/15 15:42
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){
        System.out.println("add");
    }
}
