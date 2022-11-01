package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class Annotations {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Bean
    public String simpleText() {
        System.out.println("Text message");
        return "Simple text message";
    }

    @Primary
    @Bean
    public String textBlock(String simpleText) {
        System.out.println("Text block : " + simpleText);
        return simpleText + " SpringIoC";
    }

    @Bean
    public int charCount(String text) {
        return text.length();
    }
}
