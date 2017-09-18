package com.github.szsalyi.flashcard.service.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.util.List;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class SpringConfig  {

    @Autowired
    private List<Converter<?, ?>> converters;

    @Bean
    public ConversionService createConversionService() {
        DefaultConversionService conversionService = new DefaultConversionService();
        converters.forEach(converter -> conversionService.addConverter(converter));
        return conversionService;
    }

}
