package com.example.datagenerator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgresJdbcConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
