package com.pmf.studomat.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.pmf.studomat.repository")
public class SpringJdbcConfig {

    private String connectionString;

    private String username;

    private String password;

    public SpringJdbcConfig(@Value("${db.connection-string}") String connectionString,
                            @Value("${db.username}") String username,
                            @Value("${db.password}") String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }




    @Bean
    @ConfigurationProperties
    public DataSource postgresDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(this.connectionString);
        dataSource.setUsername(this.username);
        dataSource.setPassword(this.password);

        return dataSource;
    }
}
