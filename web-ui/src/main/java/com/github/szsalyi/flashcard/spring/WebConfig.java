package com.github.szsalyi.flashcard.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by ssalyi on 9/2/2017.
 */

@Configuration
@ComponentScan(basePackages = "com.github.szsalyi.flashcard")
public class WebConfig {

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver internalViewResolver = new InternalResourceViewResolver();

        internalViewResolver.setPrefix("/WEB-INF/jsp/");
        internalViewResolver.setSuffix(".jsp");

        return internalViewResolver;
    }

}
