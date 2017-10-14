package com.github.szsalyi.flashcard.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by ssalyi on 9/2/2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.github.szsalyi.flashcard")
public class WebConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
        .addResourceLocations("/resources/");
    }

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver internalViewResolver = new InternalResourceViewResolver();

        internalViewResolver.setPrefix("/WEB-INF/jsp/");
        internalViewResolver.setSuffix(".jsp");

        return internalViewResolver;
    }

}
