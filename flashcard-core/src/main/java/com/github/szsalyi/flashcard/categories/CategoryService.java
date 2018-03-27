package com.github.szsalyi.flashcard.categories;

import com.github.szsalyi.flashcard.exception.ResourceNotFoundException;
import com.github.szsalyi.flashcard.exception.SaveException;

import java.util.List;

public interface CategoryService {
    CategoryVO save(CategoryVO categoryVO) throws SaveException;
    List<CategoryVO> getAllCategory();
    CategoryVO getCategory(long id) throws ResourceNotFoundException;
    void deleteCategory(long id) throws ResourceNotFoundException;
    List<CategoryVO> getAllCategoriesByUsername(String username);
    //List<CategoryVO> getAllCategoryByUserId(long id);
}
