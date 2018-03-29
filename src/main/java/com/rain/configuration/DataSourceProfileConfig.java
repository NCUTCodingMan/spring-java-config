package com.rain.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * 3.0开始的profile
 * @author rain
 * created on 2018/3/29
 */
@Configuration
public class DataSourceProfileConfig {

    /**
     * Profile定义了dev,prod环境下的datasource来源
     * 根据实际运行时激活哪个Profile，创建哪个bean
     * @return DataSource
     */
    @Bean(name = "dataSource")
    @Profile("dev")
    public DataSource embeddedDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:demo.sql")
                .addScript("classpath:test.data.sql")
                .build();
    }

    @Bean(name = "dataSource")
    @Profile("prod")
    public DataSource productionDatasource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("tiger");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(10);
        return dataSource;
    }
}