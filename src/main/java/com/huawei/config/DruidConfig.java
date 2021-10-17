package com.huawei.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * 配置Druid数据库连接池
 *
 * @author : gavin
 * @date : 2021-10-16
 */
@Configuration
public class DruidConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.filters}")
    private String filters;

    @Value("{spring.datasource.connectionProperties}")
    private String connectionProperties;

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(this.dbUrl);

        datasource.setUsername(username);

        datasource.setPassword(password);

        datasource.setDriverClassName(driverClassName);

        datasource.setInitialSize(initialSize);

        // 设置最小连接数
        datasource.setMinIdle(minIdle);

        datasource.setMaxActive(maxActive);

        datasource.setMaxWait(maxWait);

        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);

        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);

        datasource.setValidationQuery(validationQuery);

        datasource.setTestWhileIdle(testWhileIdle);

        datasource.setTestOnBorrow(testOnBorrow);

        datasource.setTestOnReturn(testOnReturn);

        datasource.setPoolPreparedStatements(poolPreparedStatements);

        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);

        try {
            datasource.setFilters(filters);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }

        datasource.setConnectionProperties(connectionProperties);
        return datasource;
    }
}