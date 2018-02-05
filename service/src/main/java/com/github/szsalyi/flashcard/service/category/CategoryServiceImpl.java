package com.github.szsalyi.flashcard.service.category;

import com.github.szsalyi.flashcard.entity.CategoryEntity;
import com.github.szsalyi.flashcard.exception.SaveException;
import com.github.szsalyi.flashcard.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    @Qualifier("createConversionService")
    private ConversionService conversionService;

    @Override
    public void save(final CategoryVO categoryVO) throws SaveException {
        categoryRepository.save(conversionService.convert(categoryVO, CategoryEntity.class));
    }
}
