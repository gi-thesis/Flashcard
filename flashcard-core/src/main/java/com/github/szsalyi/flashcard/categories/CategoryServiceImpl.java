package com.github.szsalyi.flashcard.categories;

import com.github.szsalyi.flashcard.exception.ResourceNotFoundException;
import com.github.szsalyi.flashcard.exception.SaveException;
import com.github.szsalyi.flashcard.users.UserEntity;
import com.github.szsalyi.flashcard.users.UserRepository;
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
    private UserRepository userRepository;

    @Autowired
    @Qualifier("createConversionService")
    private ConversionService conversionService;

    @Override
    public CategoryVO save(final CategoryVO categoryVO) throws SaveException {
        CategoryEntity categoryEntity = conversionService.convert(categoryVO, CategoryEntity.class);
        categoryEntity.setUser(conversionService.convert(categoryVO.getUser(), UserEntity.class));
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
            throw new ResourceNotFoundException("The given categories doesn't exist!");
        }
        return conversionService.convert(categoryEntity, CategoryVO.class);
    }

    @Override
    public void deleteCategory(long id) throws ResourceNotFoundException {
        categoryRepository.delete(id);
    }

    @Override
    public List<CategoryVO> getAllCategoriesByUsername(String username) {
        List<CategoryVO> categories = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryRepository.findCategoryEntitiesByUserUserName(username)) {
            categories.add(conversionService.convert(categoryEntity, CategoryVO.class));
        }
        return categories;
    }
/*
    @Override
    public List<CategoryVO> getAllCategoryByUserId(long id) {
        List<CategoryVO> categories = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryRepository.findCategoryEntitiesByUserId(id)) {
            categories.add(conversionService.convert(categoryEntity, CategoryVO.class));
        }
        return categories;
    }*/
}
