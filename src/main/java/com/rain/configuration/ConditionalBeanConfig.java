package com.rain.configuration;

import com.rain.business.CompactDisc;
import com.rain.business.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 基于@Conditional配置Bean是否会被初始化
 *  一般基于Classpath上是否加载了某个类或者其他的属性作为判断的依据
 * @author rain
 * created on 2018/3/29
 */
@Configuration
public class ConditionalBeanConfig {

    /**
     * 根据某种条件判断bean是否应该被配置
     * @return CompactDisc
     */
    @Bean
    @Conditional(MagicConditional.class)
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}