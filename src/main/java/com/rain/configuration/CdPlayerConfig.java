package com.rain.configuration;

import com.rain.business.CdPlayer;
import com.rain.business.CompactDisc;
import com.rain.business.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Configuration 配置类
 * @Bean 创建的bean将会加入到spring上下文中
 *  自定义配置信息，可用于定义bean
 * @Import 引入其他配置类定义的bean,使得在本类可以使用
 * @author rain
 * created on 2018/3/28
 */
@Configuration
@Import(CdConfig.class)
public class CdPlayerConfig {
    /**
     * 创建cdPlay对象，并初始化其依赖的对象
     * spring将会拦截sgtPeppers(),确保此方法只返回一个对象
     * @return cdPlayer
     */
//    @Bean
//    public CdPlayer cdPlayer() {
//        return new CdPlayer(sgtPeppers());
//    }

    /**
     * 类似自动装配，这种方式是推荐的方式
     * @Bean 创建的对象将会加入到spring的上下文中
     * @param compactDisc cd
     * @return cdPlayer
     */
    @Bean
    public CdPlayer cdPlayer(CompactDisc compactDisc) {
        return new CdPlayer(compactDisc);
    }
}