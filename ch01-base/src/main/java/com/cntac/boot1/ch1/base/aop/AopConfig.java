package com.cntac.boot1.ch1.base.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: AopConfig
 * @Description:
 * @author: libl
 * @date: 2019/08/15 16:10
 */
@Configuration
@ComponentScan("com.cntac.boot1.ch1.base.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
