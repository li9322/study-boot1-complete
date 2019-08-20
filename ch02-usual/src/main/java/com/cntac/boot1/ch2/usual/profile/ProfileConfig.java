package com.cntac.boot1.ch2.usual.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName: ProfileConfig
 * @Description: Profile配置
 * @author: libl
 * @date: 2019/08/19 15:10
 */
@Configuration
public class ProfileConfig {

    /**
     * // Profile为dev时实例化devDemoBean。
     */
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    /**
     * // Profile为prod时实例化prodDemoBean。
     * @return
     */
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
