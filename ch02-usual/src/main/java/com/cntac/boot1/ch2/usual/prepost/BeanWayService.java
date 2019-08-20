package com.cntac.boot1.ch2.usual.prepost;

/**
 * @ClassName: BeanWayService
 * @Description: 使用@Bean形式的Bean
 * @author: libl
 * @date: 2019/08/19 14:28
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("Bean-destroy-method");
    }
}
