package com.example.spring_jpa_test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.spring_jpa_test")
@PropertySource("test.properties")
@EnableTransactionManagement
public class H2JpaConfig {
    // ...
}

