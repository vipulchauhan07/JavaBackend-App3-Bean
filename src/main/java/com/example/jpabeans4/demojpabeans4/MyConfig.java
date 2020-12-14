package com.example.jpabeans4.demojpabeans4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public HelloWorld getHelloWorldObject() {
        return new HelloWorld();
    }
}
