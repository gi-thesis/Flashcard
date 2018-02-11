package com.github.szsalyi.flashcard.service.category;


import com.github.szsalyi.flashcard.exception.ResourceNotFoundException;
import com.github.szsalyi.flashcard.exception.SaveException;

import java.util.List;


public interface CategoryService {

    CategoryVO save(CategoryVO categoryVO) throws SaveException;

    List<CategoryVO> getAllCategory();

    CategoryVO getCategory(long id) throws ResourceNotFoundException;

    void delete(long id);
}
