package com.cntac.boot1.ch2.usual.scope;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * @ClassName: ScopeConfig
 * @Description: 配置类
 *  // 注入配置文件
 * @author: libl
 * @date: 2019/08/15 16:49
 */
@Configuration
@ComponentScan("com.cntac.boot1.ch2.usual.scope")
public class ScopeConfig {

}
