package com.springWorkout.config;

import com.springWorkout.domain.Click;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigIn() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Scope("prototype")
    public Click clickPrototype() {
        return new Click();
    }

    @Bean
    @Scope("singleton")
    public Click clickSingleton() {
        return new Click();
    }
}
