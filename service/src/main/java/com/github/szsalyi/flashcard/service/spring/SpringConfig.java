package com.github.szsalyi.flashcard.service.spring;

import com.github.szsalyi.flashcard.service.user.UserEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.List;

@Configuration
public class SpringConfig  {

    @Autowired
    private List<Converter<?, ?>> converters;

    @Bean
    public ConversionService createConversionService(){
        DefaultConversionService conversionService = new DefaultConversionService();
        converters.forEach(converter -> conversionService.addConverter(converter));
        return conversionService;
    }

}
