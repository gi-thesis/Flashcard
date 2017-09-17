package com.github.szsalyi.flashcard.service.mapper.common;


import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public final class Mapper {

    private static DozerBeanMapper dozerBeanMapper;

    static {
        dozerBeanMapper = new DozerBeanMapper();
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozerJdk8Converters.xml");

        dozerBeanMapper.setMappingFiles(mappingFiles);
    }

    private Mapper() {

    }

    public static DozerBeanMapper getDozerBeanMapper() {
        return dozerBeanMapper;
    }

}
