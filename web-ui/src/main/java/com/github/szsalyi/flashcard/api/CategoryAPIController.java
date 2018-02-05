package com.github.szsalyi.flashcard.api;

import com.github.szsalyi.flashcard.exception.SaveException;
import com.github.szsalyi.flashcard.service.category.CategoryService;
import com.github.szsalyi.flashcard.service.category.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/categories", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CategoryAPIController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryVO> createCategory(@RequestBody CategoryVO category){
        try {
            categoryService.save(category);
        } catch (SaveException e) {
            return ResponseEntity.status(500).build();
        }

        return ResponseEntity.status(201).body(category);
    }
}
