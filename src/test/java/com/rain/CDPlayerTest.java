package com.rain;

import com.rain.business.CompactDisc;
import com.rain.business.CdPlayer;
import com.rain.configuration.CdPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

/**
 * RunWith(SpringJUnit4ClassRunner.class)
 *  用于初始化Spring的应用上下文
 * ContextConfiguration(classes = CdPlayer.class)
 *  加载CdPlayer中的配置（@Configuration用于定义配置信息）
 * @author rain
 * created on 2018/3/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CdPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        cdPlayer.play();
    }
}