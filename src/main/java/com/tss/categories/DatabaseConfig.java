package com.tss.categories;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
@EnableTransactionManagement
@ComponentScan
@EnableAsync
public class DatabaseConfig {


    @Value("${SPRING_DATASOURCE_DRIVER_CLASS_NAME:org.postgresql.Driver}")
    private String driver;
    @Value("${SPRING_DATASOURCE_HIKARI_MAX_POOL_SIZE:5}")
    private int maxPoolSize;
    @Value("${SPRING_DATASOURCE_URL}")
    private String url;
    @Value("${SPRING_DATASOURCE_USERNAME}")
    private String username;
    @Value("${SPRING_DATASOURCE_PASSWORD}")
    private String password;
    @Value("${SPRING_DATASOURCE_HIKARI_CONNECTION_INIT_SQL:select 1}")
    private String connectionInitSql;
    @Value("${SPRING_DATASOURCE_HIKARI_IDLE_TIME_OUT_MS:1200000}")
    private int idleTimeOutMs;
    @Value("${SPRING_DATASOURCE_HIKARI_MAXLIFETIME_MS}")
    private int maxLifeTime;
    @Value("${SPRING_DATASOURCE_HIKARI_MIN_POOL_SIZE:2}")
    private int minPoolSize;
    @Value("${SPRING_DATASOURCE_QUERY_TIMEOUT:-1}")
    private int queryTimeOut;


    @Bean
    public DataSource dataSource() {

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setMaximumPoolSize(maxPoolSize);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setConnectionInitSql(connectionInitSql);
        hikariConfig.setIdleTimeout(idleTimeOutMs);
        hikariConfig.setMaxLifetime(maxLifeTime);
        hikariConfig.setMinimumIdle(minPoolSize);
        return new HikariDataSource(hikariConfig);

    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setQueryTimeout(queryTimeOut);
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(JdbcTemplate jdbcTemplate){
        return new NamedParameterJdbcTemplate(jdbcTemplate);
    }

    @Bean(name="objectMapper")
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    @Bean(name="emptyAsNullObjectMapper")
    public ObjectMapper objectMapper2(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        return objectMapper;
    }

    @Bean(name="failOnUnKnownObjectMapper")
    public ObjectMapper objectMapper3(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        return objectMapper;
    }

    @Bean(name="achReminderTaskExcutorThread")
    public TaskExecutor threadPoolTaskExcutorForAchReminder(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(5);
        threadPoolTaskExecutor.setThreadNamePrefix("achReminderTaskExcutorThread");
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

}
