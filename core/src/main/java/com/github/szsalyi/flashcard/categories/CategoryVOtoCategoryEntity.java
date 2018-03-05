package com.github.szsalyi.flashcard.categories;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class CategoryVOtoCategoryEntity implements Converter<CategoryVO, CategoryEntity> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public CategoryEntity convert(final CategoryVO categoryVO) {
        return mapper.map(categoryVO, CategoryEntity.class);
    }
}
