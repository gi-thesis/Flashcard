package com.github.szsalyi.flashcard.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.github.szsalyi.flashcard")
@EnableJpaRepositories(basePackages = "com.github.szsalyi.flashcard")
@SpringBootApplication(scanBasePackages = "com.github.szsalyi.flashcard")
public class FlashcardApplication {
    public static void main(final String... args) {
        SpringApplication flashcard = new SpringApplication(FlashcardApplication.class);
        flashcard.run(args);
    }
}
