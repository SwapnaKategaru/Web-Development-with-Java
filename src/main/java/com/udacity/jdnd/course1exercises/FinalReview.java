package com.udacity.jdnd.course1exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class FinalReview {
    public static void main(String[] args) {
        SpringApplication.run(FinalReview.class, args);
    }

    @Bean
    public String message() {
        System.out.println("Creating message bean");
        return "Hello, Spring!";
    }

    @Bean
    public String uppercaseMessage(MessageService messageService) {
        System.out.println("Creating uppercaseMessage bean");
        return messageService.uppercase();
    }

    @Bean
    public String lowercaseMessage(MessageService messageService) {
        System.out.println("Creating lowercaseMessage bean");
        return messageService.lowercase();
    }
}
