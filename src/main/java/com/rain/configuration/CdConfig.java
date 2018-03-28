package com.rain.configuration;

import com.rain.business.CompactDisc;
import com.rain.business.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rain
 * created on 2018/3/28
 */
@Configuration
public class CdConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
}