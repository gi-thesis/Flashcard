package com.github.szsalyi.flashcard.api;

import com.github.szsalyi.flashcard.exception.ResourceNotFoundException;
import com.github.szsalyi.flashcard.exception.SaveException;
import com.github.szsalyi.flashcard.response.Result;
import com.github.szsalyi.flashcard.service.category.CategoryService;
import com.github.szsalyi.flashcard.service.category.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/api/categories", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CategoryAPIController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryVO> createCategory(@RequestBody final CategoryVO category){
        try {
            return ResponseEntity.status(201).body(categoryService.save(category));
        } catch (SaveException e) {
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<CategoryVO>> getAllCategories() {
        return ResponseEntity.status(200).body(categoryService.getAllCategory());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CategoryVO> getCategory(@PathVariable final long id) {
        try {
            return ResponseEntity.status(200).body(categoryService.getCategory(id));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(404).build();
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Result<Boolean>> deleteCategory(@PathVariable final long id) {
        Result<Boolean> result = new Result<>();
        categoryService.delete(id);
        result.setData(true);
        return ResponseEntity.status(200).body(result);
    }


}
