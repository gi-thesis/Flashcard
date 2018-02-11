package com.github.szsalyi.flashcard.service.category;

import com.github.szsalyi.flashcard.entity.CategoryEntity;
import com.github.szsalyi.flashcard.exception.ResourceNotFoundException;
import com.github.szsalyi.flashcard.exception.SaveException;
import com.github.szsalyi.flashcard.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    @Qualifier("createConversionService")
    private ConversionService conversionService;

    @Override
    public CategoryVO save(final CategoryVO categoryVO) throws SaveException {
        CategoryEntity categoryEntity = conversionService.convert(categoryVO, CategoryEntity.class);
        return conversionService.convert(categoryRepository.save(categoryEntity), CategoryVO.class);
    }

    @Override
    public List<CategoryVO> getAllCategory() {
        List<CategoryVO> categoryVOS = new ArrayList<>();
        for (CategoryEntity categoryEntity
                : categoryRepository.findAll()) {
            categoryVOS.add(conversionService.convert(categoryEntity, CategoryVO.class));
        }
        return categoryVOS;
    }

    @Override
    public CategoryVO getCategory(final long id) throws ResourceNotFoundException {
        CategoryEntity categoryEntity = categoryRepository.findOne(id);
        if (categoryEntity == null) {
            throw new ResourceNotFoundException("The given category doesn't exist!");
        }
        return conversionService.convert(categoryEntity, CategoryVO.class);
    }

    @Override
    public void delete(final long id) {
        categoryRepository.delete(id);
    }
}
