package com.rain;

import com.rain.business.CompactDisc;
import com.rain.configuration.ConditionalBeanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author rain
 * created on 2018/3/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalBeanConfig.class)
public class ConditionalBeanTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void compactDiscShouldNull() {
        assertNotNull(compactDisc);
    }
}