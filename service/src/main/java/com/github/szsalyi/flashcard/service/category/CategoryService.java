package com.github.szsalyi.flashcard.service.category;


import com.github.szsalyi.flashcard.exception.SaveException;


public interface CategoryService {

    void save(CategoryVO categoryVO) throws SaveException;
}
