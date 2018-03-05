package com.github.szsalyi.flashcard.spring.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final String[] PATHS = new String[] {
            "/",
            "/registration",
            "/profile",
            "/login"
    };
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/resources/**")
            .addResourceLocations("/resources/");
    }

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        Arrays.asList(PATHS).stream()
                .forEach(path ->  registry.addViewController(path).setViewName("forward:/index.html"));
    }
}
