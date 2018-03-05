package com.github.szsalyi.flashcard.service.category;

import com.github.szsalyi.flashcard.entity.CategoryEntity;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class CategoryEntitytoCategoryVO implements Converter <CategoryEntity, CategoryVO> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public CategoryVO convert(final CategoryEntity categoryEntity) {
        return mapper.map(categoryEntity, CategoryVO.class);
    }
}
