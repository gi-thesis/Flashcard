package com.github.szsalyi.flashcard.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.szsalyi.flashcard")
public class FlashcardApplication {
    public static void main(String[] args) {
        SpringApplication flashcard = new SpringApplication(FlashcardApplication.class);
        flashcard.run(args);
    }
}
