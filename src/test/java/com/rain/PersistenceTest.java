package com.rain;

import com.rain.configuration.DataSourceProfileConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

import javax.sql.DataSource;

/**
 * 激活profile的方式有四种
 * 1、在web.xml中设置spring.profiles.default或者spring.profiles.active
 * 2、测试类中使用@ActiveProfiles
 * @author rain
 * created on 2018/3/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceProfileConfig.class})
@ActiveProfiles(value = "prod")
public class PersistenceTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void dataSourceShouldNotNull() {
        assertNotNull(dataSource);
    }
}