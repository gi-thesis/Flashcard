package com.github.szsalyi.flashcard.spring;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class SpringConfig  {

    @Autowired
    private List<Converter<?, ?>> converters;

    @Bean
    public DozerBeanMapper getDozerBeanMapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozerJdk8Converters.xml");

        dozerBeanMapper.setMappingFiles(mappingFiles);
        return dozerBeanMapper;
    }

    @Bean
    public ConversionService createConversionService() {
        DefaultConversionService conversionService = new DefaultConversionService();
        converters.forEach(converter -> conversionService.addConverter(converter));
        return conversionService;
    }

}
